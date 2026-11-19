; MD4_Update @ 00aa580c
00aa580c	str x23,[sp, #-0x40]!
00aa5810	stp x22,x21,[sp, #0x10]
00aa5814	stp x20,x19,[sp, #0x20]
00aa5818	stp x29,x30,[sp, #0x30]
00aa581c	add x29,sp,#0x30
00aa5820	cbz x2,0x00aa5900
00aa5824	ldp w8,w9,[x0, #0x10]
00aa5828	mov x19,x2
00aa582c	mov x21,x1
00aa5830	mov x20,x0
00aa5834	adds w8,w8,w19, LSL #0x3
00aa5838	b.cc 0x00aa5844
00aa583c	add w9,w9,#0x1
00aa5840	str w9,[x20, #0x14]
00aa5844	ldr w10,[x20, #0x58]
00aa5848	lsr x11,x19,#0x1d
00aa584c	add w9,w9,w11
00aa5850	stp w8,w9,[x20, #0x10]
00aa5854	cbz w10,0x00aa58ac
00aa5858	add x8,x10,x19
00aa585c	add x22,x20,#0x18
00aa5860	orr x8,x8,x19
00aa5864	cmp x8,#0x40
00aa5868	add x0,x22,x10
00aa586c	b.cc 0x00aa58e8
00aa5870	mov w8,#0x40
00aa5874	sub x23,x8,x10
00aa5878	mov x1,x21
00aa587c	mov x2,x23
00aa5880	bl 0x00c2ffd0
00aa5884	mov w2,#0x1
00aa5888	mov x0,x20
00aa588c	mov x1,x22
00aa5890	bl 0x00aa5918
00aa5894	mov w2,#0x44
00aa5898	mov x0,x22
00aa589c	mov w1,wzr
00aa58a0	add x21,x21,x23
00aa58a4	sub x19,x19,x23
00aa58a8	bl 0x00c301c0
00aa58ac	lsr x2,x19,#0x6
00aa58b0	cbz x2,0x00aa58cc
00aa58b4	mov x0,x20
00aa58b8	mov x1,x21
00aa58bc	bl 0x00aa5918
00aa58c0	and x8,x19,#-0x40
00aa58c4	add x21,x21,x8
00aa58c8	sub x19,x19,x8
00aa58cc	cbz x19,0x00aa5900
00aa58d0	add x0,x20,#0x18
00aa58d4	mov x1,x21
00aa58d8	mov x2,x19
00aa58dc	str w19,[x20, #0x58]
00aa58e0	bl 0x00c2ffd0
00aa58e4	b 0x00aa5900
00aa58e8	mov x1,x21
00aa58ec	mov x2,x19
00aa58f0	bl 0x00c2ffd0
00aa58f4	ldr w8,[x20, #0x58]
00aa58f8	add w8,w8,w19
00aa58fc	str w8,[x20, #0x58]
00aa5900	ldp x29,x30,[sp, #0x30]
00aa5904	ldp x20,x19,[sp, #0x20]
00aa5908	ldp x22,x21,[sp, #0x10]
00aa590c	mov w0,#0x1
00aa5910	ldr x23,[sp], #0x40
00aa5914	ret
