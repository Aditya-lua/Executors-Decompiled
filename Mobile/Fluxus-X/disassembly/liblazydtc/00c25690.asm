; FUN_00c25690 @ 00c25690
00c25690	paciasp
00c25694	stp x29,x30,[sp, #-0x30]!
00c25698	str x21,[sp, #0x10]
00c2569c	stp x20,x19,[sp, #0x20]
00c256a0	mov x29,sp
00c256a4	ldr x21,[x0, #0x1330]
00c256a8	mov x19,x1
00c256ac	ldr x8,[x21, #0x8]
00c256b0	sub x9,x8,#0xfd0
00c256b4	cmn x9,#0xff1
00c256b8	b.hi 0x00c256dc
00c256bc	mov x20,x0
00c256c0	mov w0,#0x1000
00c256c4	bl 0x00c308d0
00c256c8	cbz x0,0x00c2572c
00c256cc	mov x8,xzr
00c256d0	stp x21,xzr,[x0]
00c256d4	mov x21,x0
00c256d8	str x0,[x20, #0x1330]
00c256dc	add x9,x8,#0x20
00c256e0	add x0,x21,x8
00c256e4	adrp x8,0xcb3000
00c256e8	add x8,x8,#0xc50
00c256ec	str x9,[x21, #0x8]
00c256f0	mov w9,#0x1f
00c256f4	str x8,[x0, #0x10]!
00c256f8	ldurh w8,[x0, #0x9]
00c256fc	mov w10,#0x540
00c25700	strb w9,[x0, #0x8]
00c25704	ldr x9,[x19]
00c25708	and w8,w8,#0xf000
00c2570c	orr w8,w8,w10
00c25710	sturh w8,[x0, #0x9]
00c25714	str x9,[x0, #0x10]
00c25718	ldp x20,x19,[sp, #0x20]
00c2571c	ldr x21,[sp, #0x10]
00c25720	ldp x29,x30,[sp], #0x30
00c25724	autiasp
00c25728	ret
00c2572c	bl 0x00c2fff0
