; ossl_rsa_dup @ 00acf8e4
00acf8e4	str x25,[sp, #-0x50]!
00acf8e8	stp x24,x23,[sp, #0x10]
00acf8ec	stp x22,x21,[sp, #0x20]
00acf8f0	stp x20,x19,[sp, #0x30]
00acf8f4	stp x29,x30,[sp, #0x40]
00acf8f8	ldr x8,[x0, #0x20]
00acf8fc	mov x19,xzr
00acf900	add x29,sp,#0x40
00acf904	cbnz x8,0x00acfb1c
00acf908	mov w21,w1
00acf90c	mov x20,x0
00acf910	bl 0x00c3fca0
00acf914	mov x19,x0
00acf918	bl 0x00c3fc70
00acf91c	cmp x19,x0
00acf920	mov x19,xzr
00acf924	b.ne 0x00acfb1c
00acf928	ldr x0,[x20, #0x8]
00acf92c	bl 0x00c3fb10
00acf930	mov x19,x0
00acf934	cbz x0,0x00acfb1c
00acf938	tst w21,#0x3
00acf93c	b.eq 0x00acf968
00acf940	ldr x0,[x20, #0x28]
00acf944	cbz x0,0x00acf954
00acf948	bl 0x00c369a0
00acf94c	str x0,[x19, #0x28]
00acf950	cbz x0,0x00acfb10
00acf954	ldr x0,[x20, #0x30]
00acf958	cbz x0,0x00acf968
00acf95c	bl 0x00c369a0
00acf960	str x0,[x19, #0x30]
00acf964	cbz x0,0x00acfb10
00acf968	tbz w21,#0x0,0x00acf9e4
00acf96c	ldr x0,[x20, #0x38]
00acf970	cbz x0,0x00acf980
00acf974	bl 0x00c369a0
00acf978	str x0,[x19, #0x38]
00acf97c	cbz x0,0x00acfb10
00acf980	ldr x0,[x20, #0x40]
00acf984	cbz x0,0x00acf994
00acf988	bl 0x00c369a0
00acf98c	str x0,[x19, #0x40]
00acf990	cbz x0,0x00acfb10
00acf994	ldr x0,[x20, #0x48]
00acf998	cbz x0,0x00acf9a8
00acf99c	bl 0x00c369a0
00acf9a0	str x0,[x19, #0x48]
00acf9a4	cbz x0,0x00acfb10
00acf9a8	ldr x0,[x20, #0x50]
00acf9ac	cbz x0,0x00acf9bc
00acf9b0	bl 0x00c369a0
00acf9b4	str x0,[x19, #0x50]
00acf9b8	cbz x0,0x00acfb10
00acf9bc	ldr x0,[x20, #0x58]
00acf9c0	cbz x0,0x00acf9d0
00acf9c4	bl 0x00c369a0
00acf9c8	str x0,[x19, #0x58]
00acf9cc	cbz x0,0x00acfb10
00acf9d0	ldr x0,[x20, #0x60]
00acf9d4	cbz x0,0x00acf9e4
00acf9d8	bl 0x00c369a0
00acf9dc	str x0,[x19, #0x60]
00acf9e0	cbz x0,0x00acfb10
00acf9e4	ldr w8,[x20, #0x10]
00acf9e8	str w8,[x19, #0x10]
00acf9ec	ldr w8,[x20, #0xa4]
00acf9f0	str w8,[x19, #0xa4]
00acf9f4	ldr w8,[x20, #0x78]
00acf9f8	str w8,[x19, #0x78]
00acf9fc	ldur q0,[x20, #0x68]
00acfa00	stur q0,[x19, #0x68]
00acfa04	tbz w21,#0x0,0x00acfac4
00acfa08	ldr x0,[x20, #0x88]
00acfa0c	bl 0x00c325e0
00acfa10	cmp w0,#0x1
00acfa14	b.lt 0x00acfac4
00acfa18	mov w21,w0
00acfa1c	mov x0,xzr
00acfa20	mov w1,w21
00acfa24	bl 0x00c34790
00acfa28	str x0,[x19, #0x88]
00acfa2c	cbz x0,0x00acfb10
00acfa30	adrp x23,0x2c4000
00acfa34	mov w22,wzr
00acfa38	add x23,x23,#0x1a6
00acfa3c	mov w0,#0x28
00acfa40	mov w2,#0x188
00acfa44	mov x1,x23
00acfa48	bl 0x00c34250
00acfa4c	cbz x0,0x00acfb38
00acfa50	mov x24,x0
00acfa54	ldr x0,[x19, #0x88]
00acfa58	mov x1,x24
00acfa5c	bl 0x00c347a0
00acfa60	ldr x0,[x20, #0x88]
00acfa64	mov w1,w22
00acfa68	bl 0x00c32610
00acfa6c	mov x25,x0
00acfa70	ldr x0,[x0]
00acfa74	cbz x0,0x00acfa84
00acfa78	bl 0x00c369a0
00acfa7c	str x0,[x24]
00acfa80	cbz x0,0x00acfb10
00acfa84	ldr x0,[x25, #0x8]
00acfa88	cbz x0,0x00acfa98
00acfa8c	bl 0x00c369a0
00acfa90	str x0,[x24, #0x8]
00acfa94	cbz x0,0x00acfb10
00acfa98	ldr x0,[x25, #0x10]
00acfa9c	cbz x0,0x00acfaac
00acfaa0	bl 0x00c369a0
00acfaa4	str x0,[x24, #0x10]
00acfaa8	cbz x0,0x00acfb10
00acfaac	add w22,w22,#0x1
00acfab0	cmp w22,w21
00acfab4	b.lt 0x00acfa3c
00acfab8	mov x0,x19
00acfabc	bl 0x00c3fc60
00acfac0	cbz w0,0x00acfb10
00acfac4	ldr x0,[x20, #0x80]
00acfac8	cbz x0,0x00acfafc
00acfacc	bl 0x00c3fc40
00acfad0	str x0,[x19, #0x80]
00acfad4	ldr x9,[x20, #0x80]
00acfad8	mov x8,x0
00acfadc	ldr x0,[x9, #0x8]
00acfae0	cbz x0,0x00acfafc
00acfae4	ldr x8,[x8, #0x8]
00acfae8	cbnz x8,0x00acfafc
00acfaec	bl 0x00c38290
00acfaf0	ldr x8,[x19, #0x80]
00acfaf4	str x0,[x8, #0x20]
00acfaf8	cbz x0,0x00acfb10
00acfafc	add x1,x19,#0x90
00acfb00	add x2,x20,#0x90
00acfb04	mov w0,#0x9
00acfb08	bl 0x00c356b0
00acfb0c	cbnz w0,0x00acfb1c
00acfb10	mov x0,x19
00acfb14	bl 0x00c326d0
00acfb18	mov x19,xzr
00acfb1c	mov x0,x19
00acfb20	ldp x29,x30,[sp, #0x40]
00acfb24	ldp x20,x19,[sp, #0x30]
00acfb28	ldp x22,x21,[sp, #0x20]
00acfb2c	ldp x24,x23,[sp, #0x10]
00acfb30	ldr x25,[sp], #0x50
00acfb34	ret
00acfb38	bl 0x00c342a0
00acfb3c	adrp x0,0x2c4000
00acfb40	adrp x2,0x2b6000
00acfb44	add x0,x0,#0x1a6
00acfb48	add x2,x2,#0x3e1
00acfb4c	mov w1,#0x189
00acfb50	bl 0x00c342b0
00acfb54	mov w1,#0x100
00acfb58	mov w0,#0x4
00acfb5c	movk w1,#0xc, LSL #16
00acfb60	mov x2,xzr
00acfb64	bl 0x00c342c0
00acfb68	b 0x00acfb10
