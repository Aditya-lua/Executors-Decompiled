; PEM_write_PUBKEY_ex @ 00ab5834
00ab5834	sub sp,sp,#0x40
00ab5838	stp x20,x19,[sp, #0x20]
00ab583c	mov x4,x3
00ab5840	mov x20,x1
00ab5844	adrp x2,0x2b9000
00ab5848	adrp x3,0x2a2000
00ab584c	mov x19,x0
00ab5850	add x2,x2,#0x56f
00ab5854	add x3,x3,#0xb58
00ab5858	mov w1,#0x86
00ab585c	mov x0,x20
00ab5860	str x21,[sp, #0x10]
00ab5864	stp x29,x30,[sp, #0x30]
00ab5868	add x29,sp,#0x30
00ab586c	bl 0x00c3b960
00ab5870	mov x21,x0
00ab5874	bl 0x00c3b7d0
00ab5878	cbz w0,0x00ab589c
00ab587c	mov x0,x21
00ab5880	mov x1,x19
00ab5884	bl 0x00c3b880
00ab5888	mov w19,w0
00ab588c	mov x0,x21
00ab5890	bl 0x00c3b890
00ab5894	mov w0,w19
00ab5898	b 0x00ab58d4
00ab589c	mov x0,x21
00ab58a0	bl 0x00c3b890
00ab58a4	adrp x0,0xcb5000
00ab58a8	ldr x0,[x0, #0x4c0]
00ab58ac	adrp x1,0x2da000
00ab58b0	add x1,x1,#0x514
00ab58b4	mov x2,x19
00ab58b8	mov x3,x20
00ab58bc	mov x4,xzr
00ab58c0	mov x5,xzr
00ab58c4	mov w6,wzr
00ab58c8	mov x7,xzr
00ab58cc	str xzr,[sp]
00ab58d0	bl 0x00c36060
00ab58d4	ldp x29,x30,[sp, #0x30]
00ab58d8	ldp x20,x19,[sp, #0x20]
00ab58dc	ldr x21,[sp, #0x10]
00ab58e0	add sp,sp,#0x40
00ab58e4	ret
