; FUN_00c25888 @ 00c25888
00c25888	paciasp
00c2588c	stp x29,x30,[sp, #-0x30]!
00c25890	str x21,[sp, #0x10]
00c25894	stp x20,x19,[sp, #0x20]
00c25898	mov x29,sp
00c2589c	ldr x21,[x0, #0x1330]
00c258a0	mov x19,x1
00c258a4	ldr x8,[x21, #0x8]
00c258a8	sub x9,x8,#0xfd0
00c258ac	cmn x9,#0xff1
00c258b0	b.hi 0x00c258d4
00c258b4	mov x20,x0
00c258b8	mov w0,#0x1000
00c258bc	bl 0x00c308d0
00c258c0	cbz x0,0x00c25930
00c258c4	mov x8,xzr
00c258c8	stp x21,xzr,[x0]
00c258cc	mov x21,x0
00c258d0	str x0,[x20, #0x1330]
00c258d4	add x9,x8,#0x20
00c258d8	mov x0,x19
00c258dc	add x20,x21,x8
00c258e0	str x9,[x21, #0x8]
00c258e4	bl 0x00c2ff50
00c258e8	adrp x9,0xcb1000
00c258ec	add x9,x9,#0x4c0
00c258f0	mov w11,#0x540
00c258f4	str x9,[x20, #0x10]!
00c258f8	ldurh w9,[x20, #0x9]
00c258fc	mov x8,x0
00c25900	mov w10,#0x8
00c25904	and w9,w9,#0xf000
00c25908	strb w10,[x20, #0x8]
00c2590c	orr w9,w9,w11
00c25910	stp x19,x8,[x20, #0x10]
00c25914	sturh w9,[x20, #0x9]
00c25918	mov x0,x20
00c2591c	ldp x20,x19,[sp, #0x20]
00c25920	ldr x21,[sp, #0x10]
00c25924	ldp x29,x30,[sp], #0x30
00c25928	autiasp
00c2592c	ret
00c25930	bl 0x00c2fff0
