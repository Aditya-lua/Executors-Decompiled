; FUN_00bf95fc @ 00bf95fc
00bf95fc	paciasp
00bf9600	sub sp,sp,#0x50
00bf9604	stp x29,x30,[sp, #0x20]
00bf9608	stp x22,x21,[sp, #0x30]
00bf960c	stp x20,x19,[sp, #0x40]
00bf9610	add x29,sp,#0x20
00bf9614	adrp x20,0xcb5000
00bf9618	mov x19,x1
00bf961c	mov x21,x0
00bf9620	ldr x20,[x20, #0xd00]
00bf9624	str x20,[sp, #0x8]
00bf9628	ldar x8,[x20]
00bf962c	cmn x8,#0x1
00bf9630	b.eq 0x00bf965c
00bf9634	add x8,sp,#0x8
00bf9638	sub x9,x29,#0x8
00bf963c	adrp x0,0xcb5000
00bf9640	stur x8,[x29, #-0x8]
00bf9644	nop
00bf9648	adr x2,0xc0bab0
00bf964c	str x9,[sp, #0x10]
00bf9650	add x1,sp,#0x10
00bf9654	ldr x0,[x0, #0xd00]
00bf9658	bl 0x00c305d0
00bf965c	ldp x8,x10,[x19, #0x10]
00bf9660	ldrsw x9,[x20, #0x8]
00bf9664	sub x22,x9,#0x1
00bf9668	sub x9,x10,x8
00bf966c	cmp x22,x9, ASR #0x3
00bf9670	b.cs 0x00bf9710
00bf9674	ldr x19,[x8, x22, LSL #0x3]
00bf9678	cbz x19,0x00bf9710
00bf967c	add x1,x19,#0x8
00bf9680	mov w0,#0x1
00bf9684	bl 0x00c2bce0
00bf9688	mov x20,x21
00bf968c	ldp x8,x9,[x20, #0x10]!
00bf9690	sub x9,x9,x8
00bf9694	asr x10,x9,#0x3
00bf9698	cmp x10,x22
00bf969c	b.hi 0x00bf96c8
00bf96a0	add x9,x22,#0x1
00bf96a4	subs x1,x9,x10
00bf96a8	b.ls 0x00bf96bc
00bf96ac	mov x0,x20
00bf96b0	bl 0x00c0b6e4
00bf96b4	ldr x8,[x20]
00bf96b8	b 0x00bf96c8
00bf96bc	b.cs 0x00bf96c8
00bf96c0	add x9,x8,x9, LSL #0x3
00bf96c4	str x9,[x21, #0x18]
00bf96c8	ldr x21,[x8, x22, LSL #0x3]
00bf96cc	cbz x21,0x00bf96f0
00bf96d0	add x1,x21,#0x8
00bf96d4	mov x0,#-0x1
00bf96d8	bl 0x00c2bd10
00bf96dc	cbnz x0,0x00bf96f0
00bf96e0	ldr x8,[x21]
00bf96e4	mov x0,x21
00bf96e8	ldr x8,[x8, #0x10]
00bf96ec	blr x8
00bf96f0	ldr x8,[x20]
00bf96f4	str x19,[x8, x22, LSL #0x3]
00bf96f8	ldp x20,x19,[sp, #0x40]
00bf96fc	ldp x22,x21,[sp, #0x30]
00bf9700	ldp x29,x30,[sp, #0x20]
00bf9704	add sp,sp,#0x50
00bf9708	autiasp
00bf970c	ret
00bf9710	bl 0x00bd8968
