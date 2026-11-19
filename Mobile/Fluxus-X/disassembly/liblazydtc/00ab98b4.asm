; FUN_00ab98b4 @ 00ab98b4
00ab98b4	str x25,[sp, #-0x50]!
00ab98b8	stp x22,x21,[sp, #0x20]
00ab98bc	stp x20,x19,[sp, #0x30]
00ab98c0	mov x19,x3
00ab98c4	mov x20,x2
00ab98c8	mov w21,w1
00ab98cc	mov x22,x0
00ab98d0	orr w25,wzr,#0x7fffffff
00ab98d4	stp x24,x23,[sp, #0x10]
00ab98d8	stp x29,x30,[sp, #0x40]
00ab98dc	add x29,sp,#0x40
00ab98e0	ldr x2,[x20]
00ab98e4	cbz x2,0x00ab9960
00ab98e8	str x25,[sp, #0x8]
00ab98ec	cbz x19,0x00ab9900
00ab98f0	ldr x8,[x19]
00ab98f4	cmp x8,#0x0
00ab98f8	cset w23,eq
00ab98fc	b 0x00ab9904
00ab9900	mov w23,#0x1
00ab9904	ldr x3,[x20, #0x8]
00ab9908	mov x0,x22
00ab990c	mov w1,w21
00ab9910	mov x4,xzr
00ab9914	bl 0x00c3b960
00ab9918	cbz x0,0x00ab998c
00ab991c	add x2,sp,#0x8
00ab9920	mov x1,x19
00ab9924	mov x24,x0
00ab9928	bl 0x00c3b870
00ab992c	cbz w0,0x00ab9944
00ab9930	ldr w8,[sp, #0x8]
00ab9934	cmp w23,#0x0
00ab9938	sub w9,w25,w8
00ab993c	csel w23,w8,w9,ne
00ab9940	b 0x00ab9948
00ab9944	mov w23,#0xffffffff
00ab9948	mov x0,x24
00ab994c	bl 0x00c3b890
00ab9950	cmn w23,#0x1
00ab9954	add x20,x20,#0x10
00ab9958	b.eq 0x00ab98e0
00ab995c	b 0x00ab9990
00ab9960	bl 0x00c342a0
00ab9964	adrp x0,0x2dc000
00ab9968	adrp x2,0x2be000
00ab996c	add x0,x0,#0x823
00ab9970	add x2,x2,#0x1dd
00ab9974	mov w1,#0x46
00ab9978	bl 0x00c342b0
00ab997c	mov w0,#0xd
00ab9980	mov w1,#0xc4
00ab9984	mov x2,xzr
00ab9988	bl 0x00c342c0
00ab998c	mov w23,#0xffffffff
00ab9990	mov w0,w23
00ab9994	ldp x29,x30,[sp, #0x40]
00ab9998	ldp x20,x19,[sp, #0x30]
00ab999c	ldp x22,x21,[sp, #0x20]
00ab99a0	ldp x24,x23,[sp, #0x10]
00ab99a4	ldr x25,[sp], #0x50
00ab99a8	ret
