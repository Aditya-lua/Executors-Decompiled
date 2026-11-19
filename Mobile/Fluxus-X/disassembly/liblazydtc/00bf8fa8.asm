; FUN_00bf8fa8 @ 00bf8fa8
00bf8fa8	paciasp
00bf8fac	sub sp,sp,#0x50
00bf8fb0	stp x29,x30,[sp, #0x20]
00bf8fb4	stp x22,x21,[sp, #0x30]
00bf8fb8	stp x20,x19,[sp, #0x40]
00bf8fbc	add x29,sp,#0x20
00bf8fc0	adrp x20,0xcb5000
00bf8fc4	mov x19,x1
00bf8fc8	mov x21,x0
00bf8fcc	ldr x20,[x20, #0xc28]
00bf8fd0	str x20,[sp, #0x8]
00bf8fd4	ldar x8,[x20]
00bf8fd8	cmn x8,#0x1
00bf8fdc	b.eq 0x00bf9008
00bf8fe0	add x8,sp,#0x8
00bf8fe4	sub x9,x29,#0x8
00bf8fe8	adrp x0,0xcb5000
00bf8fec	stur x8,[x29, #-0x8]
00bf8ff0	nop
00bf8ff4	adr x2,0xc0bab0
00bf8ff8	str x9,[sp, #0x10]
00bf8ffc	add x1,sp,#0x10
00bf9000	ldr x0,[x0, #0xc28]
00bf9004	bl 0x00c305d0
00bf9008	ldp x8,x10,[x19, #0x10]
00bf900c	ldrsw x9,[x20, #0x8]
00bf9010	sub x22,x9,#0x1
00bf9014	sub x9,x10,x8
00bf9018	cmp x22,x9, ASR #0x3
00bf901c	b.cs 0x00bf90bc
00bf9020	ldr x19,[x8, x22, LSL #0x3]
00bf9024	cbz x19,0x00bf90bc
00bf9028	add x1,x19,#0x8
00bf902c	mov w0,#0x1
00bf9030	bl 0x00c2bce0
00bf9034	mov x20,x21
00bf9038	ldp x8,x9,[x20, #0x10]!
00bf903c	sub x9,x9,x8
00bf9040	asr x10,x9,#0x3
00bf9044	cmp x10,x22
00bf9048	b.hi 0x00bf9074
00bf904c	add x9,x22,#0x1
00bf9050	subs x1,x9,x10
00bf9054	b.ls 0x00bf9068
00bf9058	mov x0,x20
00bf905c	bl 0x00c0b6e4
00bf9060	ldr x8,[x20]
00bf9064	b 0x00bf9074
00bf9068	b.cs 0x00bf9074
00bf906c	add x9,x8,x9, LSL #0x3
00bf9070	str x9,[x21, #0x18]
00bf9074	ldr x21,[x8, x22, LSL #0x3]
00bf9078	cbz x21,0x00bf909c
00bf907c	add x1,x21,#0x8
00bf9080	mov x0,#-0x1
00bf9084	bl 0x00c2bd10
00bf9088	cbnz x0,0x00bf909c
00bf908c	ldr x8,[x21]
00bf9090	mov x0,x21
00bf9094	ldr x8,[x8, #0x10]
00bf9098	blr x8
00bf909c	ldr x8,[x20]
00bf90a0	str x19,[x8, x22, LSL #0x3]
00bf90a4	ldp x20,x19,[sp, #0x40]
00bf90a8	ldp x22,x21,[sp, #0x30]
00bf90ac	ldp x29,x30,[sp, #0x20]
00bf90b0	add sp,sp,#0x50
00bf90b4	autiasp
00bf90b8	ret
00bf90bc	bl 0x00bd8968
