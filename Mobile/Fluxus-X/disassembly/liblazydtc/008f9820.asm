; std::__ndk1::operator+ @ 008f9820
008f9820	stp x26,x25,[sp, #-0x50]!
008f9824	stp x24,x23,[sp, #0x10]
008f9828	stp x22,x21,[sp, #0x20]
008f982c	stp x20,x19,[sp, #0x30]
008f9830	stp x29,x30,[sp, #0x40]
008f9834	add x29,sp,#0x40
008f9838	stp xzr,xzr,[x8, #0x8]
008f983c	str xzr,[x8]
008f9840	ldrb w26,[x1]
008f9844	mov x19,x8
008f9848	ldrb w8,[x0]
008f984c	ldr x9,[x1, #0x8]
008f9850	ldp x10,x11,[x0, #0x8]
008f9854	lsr w12,w26,#0x1
008f9858	tst w26,#0x1
008f985c	csel x21,x12,x9,eq
008f9860	lsr w9,w8,#0x1
008f9864	tst w8,#0x1
008f9868	csel x22,x9,x10,eq
008f986c	add x8,x21,x22
008f9870	mov x20,x1
008f9874	csinc x23,x11,x0,ne
008f9878	cmn x8,#0x10
008f987c	b.cs 0x008f9904
008f9880	cmp x8,#0x16
008f9884	b.hi 0x008f98dc
008f9888	lsl w8,w22,#0x1
008f988c	mov x24,x19
008f9890	strb w8,[x24], #0x1
008f9894	cbz x22,0x008f98a8
008f9898	mov x0,x24
008f989c	mov x1,x23
008f98a0	mov x2,x22
008f98a4	bl 0x00c2ffd0
008f98a8	strb wzr,[x24, x22]
008f98ac	ldr x8,[x20, #0x10]
008f98b0	tst w26,#0x1
008f98b4	csinc x1,x8,x20,ne
008f98b8	mov x0,x19
008f98bc	mov x2,x21
008f98c0	bl 0x00c308c0
008f98c4	ldp x29,x30,[sp, #0x40]
008f98c8	ldp x20,x19,[sp, #0x30]
008f98cc	ldp x22,x21,[sp, #0x20]
008f98d0	ldp x24,x23,[sp, #0x10]
008f98d4	ldp x26,x25,[sp], #0x50
008f98d8	ret
008f98dc	add x8,x8,#0x10
008f98e0	and x25,x8,#-0x10
008f98e4	mov x0,x25
008f98e8	bl 0x00c2fed0
008f98ec	mov x24,x0
008f98f0	orr x8,x25,#0x1
008f98f4	stp x22,x0,[x19, #0x8]
008f98f8	str x8,[x19]
008f98fc	cbnz x22,0x008f9898
008f9900	b 0x008f98a8
008f9904	mov x0,x19
008f9908	bl 0x00c30ce0
