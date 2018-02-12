package myGildedRose;

public interface IUpdateVisitor {

	void update(CheeseItem item);
	void update(TicketItem item);
	void update(RegularItem item);
	void update(ConjuredItem item);

	
}
