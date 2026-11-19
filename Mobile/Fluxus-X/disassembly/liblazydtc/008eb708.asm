; cpr::Session::SetBearer @ 008eb708
008eb708	stp x20,x19,[sp, #-0x20]!
008eb70c	stp x29,x30,[sp, #0x10]
008eb710	add x29,sp,#0x10
008eb714	ldr x8,[x0, #0x18]
008eb718	mov x19,x0
008eb71c	mov x20,x1
008eb720	mov w1,#0x6b
008eb724	ldr x0,[x8]
008eb728	mov w2,#0x40
008eb72c	bl 0x00c317c0
008eb730	ldr x8,[x19, #0x18]
008eb734	ldr x9,[x20]
008eb738	mov x0,x20
008eb73c	ldr x19,[x8]
008eb740	ldr x8,[x9, #0x10]
008eb744	blr x8
008eb748	ldp x29,x30,[sp, #0x10]
008eb74c	mov w1,#0x27ec
008eb750	mov x2,x0
008eb754	mov x0,x19
008eb758	ldp x20,x19,[sp], #0x20
008eb75c	b 0x00c317c0
