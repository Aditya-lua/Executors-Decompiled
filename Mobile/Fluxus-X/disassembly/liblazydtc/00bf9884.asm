; FUN_00bf9884 @ 00bf9884
00bf9884	paciasp
00bf9888	sub sp,sp,#0x50
00bf988c	stp x29,x30,[sp, #0x20]
00bf9890	stp x22,x21,[sp, #0x30]
00bf9894	stp x20,x19,[sp, #0x40]
00bf9898	add x29,sp,#0x20
00bf989c	adrp x20,0xcb5000
00bf98a0	mov x19,x1
00bf98a4	mov x21,x0
00bf98a8	ldr x20,[x20, #0xd20]
00bf98ac	str x20,[sp, #0x8]
00bf98b0	ldar x8,[x20]
00bf98b4	cmn x8,#0x1
00bf98b8	b.eq 0x00bf98e4
00bf98bc	add x8,sp,#0x8
00bf98c0	sub x9,x29,#0x8
00bf98c4	adrp x0,0xcb5000
00bf98c8	stur x8,[x29, #-0x8]
00bf98cc	nop
00bf98d0	adr x2,0xc0bab0
00bf98d4	str x9,[sp, #0x10]
00bf98d8	add x1,sp,#0x10
00bf98dc	ldr x0,[x0, #0xd20]
00bf98e0	bl 0x00c305d0
00bf98e4	ldp x8,x10,[x19, #0x10]
00bf98e8	ldrsw x9,[x20, #0x8]
00bf98ec	sub x22,x9,#0x1
00bf98f0	sub x9,x10,x8
00bf98f4	cmp x22,x9, ASR #0x3
00bf98f8	b.cs 0x00bf9998
00bf98fc	ldr x19,[x8, x22, LSL #0x3]
00bf9900	cbz x19,0x00bf9998
00bf9904	add x1,x19,#0x8
00bf9908	mov w0,#0x1
00bf990c	bl 0x00c2bce0
00bf9910	mov x20,x21
00bf9914	ldp x8,x9,[x20, #0x10]!
00bf9918	sub x9,x9,x8
00bf991c	asr x10,x9,#0x3
00bf9920	cmp x10,x22
00bf9924	b.hi 0x00bf9950
00bf9928	add x9,x22,#0x1
00bf992c	subs x1,x9,x10
00bf9930	b.ls 0x00bf9944
00bf9934	mov x0,x20
00bf9938	bl 0x00c0b6e4
00bf993c	ldr x8,[x20]
00bf9940	b 0x00bf9950
00bf9944	b.cs 0x00bf9950
00bf9948	add x9,x8,x9, LSL #0x3
00bf994c	str x9,[x21, #0x18]
00bf9950	ldr x21,[x8, x22, LSL #0x3]
00bf9954	cbz x21,0x00bf9978
00bf9958	add x1,x21,#0x8
00bf995c	mov x0,#-0x1
00bf9960	bl 0x00c2bd10
00bf9964	cbnz x0,0x00bf9978
00bf9968	ldr x8,[x21]
00bf996c	mov x0,x21
00bf9970	ldr x8,[x8, #0x10]
00bf9974	blr x8
00bf9978	ldr x8,[x20]
00bf997c	str x19,[x8, x22, LSL #0x3]
00bf9980	ldp x20,x19,[sp, #0x40]
00bf9984	ldp x22,x21,[sp, #0x30]
00bf9988	ldp x29,x30,[sp, #0x20]
00bf998c	add sp,sp,#0x50
00bf9990	autiasp
00bf9994	ret
00bf9998	bl 0x00bd8968
