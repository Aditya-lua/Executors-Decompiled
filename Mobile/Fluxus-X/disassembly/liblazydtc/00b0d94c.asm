; X509_verify_cert @ 00b0d94c
00b0d94c	str x23,[sp, #-0x40]!
00b0d950	stp x22,x21,[sp, #0x10]
00b0d954	stp x20,x19,[sp, #0x20]
00b0d958	stp x29,x30,[sp, #0x30]
00b0d95c	add x29,sp,#0x30
00b0d960	cbz x0,0x00b0d9a8
00b0d964	ldr x1,[x0, #0x8]
00b0d968	mov x19,x0
00b0d96c	cbz x1,0x00b0d9e0
00b0d970	mov x20,x19
00b0d974	ldr x8,[x20, #0x98]!
00b0d978	cbz x8,0x00b0da2c
00b0d97c	bl 0x00c342a0
00b0d980	adrp x0,0x2a0000
00b0d984	adrp x2,0x2ca000
00b0d988	add x0,x0,#0xe02
00b0d98c	add x2,x2,#0x666
00b0d990	mov w1,#0x118
00b0d994	bl 0x00c342b0
00b0d998	mov w1,#0x101
00b0d99c	mov w0,#0xb
00b0d9a0	movk w1,#0xc, LSL #16
00b0d9a4	b 0x00b0da04
00b0d9a8	bl 0x00c342a0
00b0d9ac	adrp x0,0x2a0000
00b0d9b0	adrp x2,0x2ca000
00b0d9b4	add x0,x0,#0xe02
00b0d9b8	add x2,x2,#0x666
00b0d9bc	mov w1,#0x10a
00b0d9c0	bl 0x00c342b0
00b0d9c4	mov w8,#0x101
00b0d9c8	movk w8,#0xc, LSL #16
00b0d9cc	add w1,w8,#0x1
00b0d9d0	mov w0,#0xb
00b0d9d4	mov x2,xzr
00b0d9d8	bl 0x00c342c0
00b0d9dc	b 0x00b0da14
00b0d9e0	bl 0x00c342a0
00b0d9e4	adrp x0,0x2a0000
00b0d9e8	adrp x2,0x2ca000
00b0d9ec	add x0,x0,#0xe02
00b0d9f0	add x2,x2,#0x666
00b0d9f4	mov w1,#0x10e
00b0d9f8	bl 0x00c342b0
00b0d9fc	mov w0,#0xb
00b0da00	mov w1,#0x69
00b0da04	mov x2,xzr
00b0da08	bl 0x00c342c0
00b0da0c	mov w8,#0x45
00b0da10	str w8,[x19, #0xb0]
00b0da14	mov w0,#0xffffffff
00b0da18	ldp x29,x30,[sp, #0x30]
00b0da1c	ldp x20,x19,[sp, #0x20]
00b0da20	ldp x22,x21,[sp, #0x10]
00b0da24	ldr x23,[sp], #0x40
00b0da28	ret
00b0da2c	mov w2,#0x1
00b0da30	mov x0,x20
00b0da34	mov w21,#0x1
00b0da38	bl 0x00c3ef60
00b0da3c	cbz w0,0x00b0dba0
00b0da40	ldr x0,[x19, #0x8]
00b0da44	str w21,[x19, #0x94]
00b0da48	bl 0x00c32cb0
00b0da4c	ldr x8,[x19, #0x20]
00b0da50	ldr w8,[x8, #0x2c]
00b0da54	cmp w8,#0x1
00b0da58	b.lt 0x00b0dac0
00b0da5c	cbz x0,0x00b0da88
00b0da60	cmp w8,#0x5
00b0da64	mov w9,#0x5
00b0da68	csel w21,w8,w9,lt
00b0da6c	bl 0x00c324c0
00b0da70	adrp x8,0x77b000
00b0da74	add x8,x8,#0x7f4
00b0da78	add x8,x8,w21, SXTW  #0x2
00b0da7c	ldur w8,[x8, #-0x4]
00b0da80	cmp w0,w8
00b0da84	b.ge 0x00b0dac0
00b0da88	ldr x0,[x19, #0x8]
00b0da8c	str wzr,[x19, #0xac]
00b0da90	cbnz x0,0x00b0daa0
00b0da94	ldr x0,[x20]
00b0da98	mov w1,wzr
00b0da9c	bl 0x00c32610
00b0daa0	ldr x8,[x19, #0x38]
00b0daa4	str x0,[x19, #0xb8]
00b0daa8	mov w9,#0x42
00b0daac	mov w0,wzr
00b0dab0	mov x1,x19
00b0dab4	str w9,[x19, #0xb0]
00b0dab8	blr x8
00b0dabc	cbz w0,0x00b0da18
00b0dac0	ldr x8,[x19, #0xf0]
00b0dac4	cbz x8,0x00b0dbc4
00b0dac8	ldr x0,[x8, #0x8]
00b0dacc	bl 0x00c325e0
00b0dad0	cmp w0,#0x1
00b0dad4	b.lt 0x00b0dbc4
00b0dad8	ldr x23,[x19, #0xf0]
00b0dadc	ldr x21,[x19, #0x8]
00b0dae0	ldr x0,[x23, #0x20]
00b0dae4	bl 0x00c31a90
00b0dae8	movi d0,#-0x1
00b0daec	stp xzr,xzr,[x23, #0x18]
00b0daf0	stur d0,[x23, #0x2c]
00b0daf4	ldr x1,[x19, #0x8]
00b0daf8	mov x0,x19
00b0dafc	mov w2,wzr
00b0db00	bl 0x00b11eb4
00b0db04	mov w22,w0
00b0db08	cbz w0,0x00b0dba8
00b0db0c	ldr x1,[x20]
00b0db10	mov x0,xzr
00b0db14	bl 0x00b0ed4c
00b0db18	cbz w0,0x00b0dbe8
00b0db1c	cmp w22,#0x1
00b0db20	b.lt 0x00b0dbf8
00b0db24	ldr x8,[x19, #0x20]
00b0db28	mov x0,xzr
00b0db2c	mov x1,x21
00b0db30	mov x2,xzr
00b0db34	ldr x3,[x8, #0x18]
00b0db38	bl 0x00c36570
00b0db3c	cbz w0,0x00b0db78
00b0db40	mov w22,w0
00b0db44	mov x0,x21
00b0db48	str wzr,[x19, #0xac]
00b0db4c	cbnz x21,0x00b0db5c
00b0db50	ldr x0,[x20]
00b0db54	mov w1,wzr
00b0db58	bl 0x00c32610
00b0db5c	ldr x8,[x19, #0x38]
00b0db60	str x0,[x19, #0xb8]
00b0db64	mov w0,wzr
00b0db68	mov x1,x19
00b0db6c	str w22,[x19, #0xb0]
00b0db70	blr x8
00b0db74	cbz w0,0x00b0dbd4
00b0db78	ldrb w8,[x23, #0x38]
00b0db7c	tbnz w8,#0x0,0x00b0db8c
00b0db80	mov x0,x19
00b0db84	bl 0x00b11384
00b0db88	cbz w0,0x00b0dbd4
00b0db8c	ldr x8,[x19, #0x38]
00b0db90	mov w0,#0x1
00b0db94	str wzr,[x19, #0xac]
00b0db98	str x21,[x19, #0xb8]
00b0db9c	b 0x00b0dc7c
00b0dba0	mov w8,#0x11
00b0dba4	b 0x00b0da10
00b0dba8	cbz x23,0x00b0dbbc
00b0dbac	ldrb w8,[x23, #0x28]
00b0dbb0	mov w9,#0x5
00b0dbb4	tst w8,w9
00b0dbb8	b.ne 0x00b0dbc4
00b0dbbc	ldr w8,[x23, #0x2c]
00b0dbc0	tbnz w8,#0x1f,0x00b0db0c
00b0dbc4	mov x0,x19
00b0dbc8	bl 0x00b0dcb0
00b0dbcc	cmp w0,#0x0
00b0dbd0	b.gt 0x00b0da18
00b0dbd4	ldr w8,[x19, #0xb0]
00b0dbd8	cbnz w8,0x00b0da18
00b0dbdc	mov w8,#0x1
00b0dbe0	str w8,[x19, #0xb0]
00b0dbe4	b 0x00b0da18
00b0dbe8	mov w0,#0xffffffff
00b0dbec	ldr w8,[x19, #0xb0]
00b0dbf0	cbnz w8,0x00b0da18
00b0dbf4	b 0x00b0dbdc
00b0dbf8	tbnz w22,#0x1f,0x00b0dc90
00b0dbfc	ldr x8,[x19, #0x20]
00b0dc00	mov x0,xzr
00b0dc04	mov x1,x21
00b0dc08	mov x2,xzr
00b0dc0c	ldr x3,[x8, #0x18]
00b0dc10	bl 0x00c36570
00b0dc14	cbz w0,0x00b0dc50
00b0dc18	mov w22,w0
00b0dc1c	mov x0,x21
00b0dc20	str wzr,[x19, #0xac]
00b0dc24	cbnz x21,0x00b0dc34
00b0dc28	ldr x0,[x20]
00b0dc2c	mov w1,wzr
00b0dc30	bl 0x00c32610
00b0dc34	ldr x8,[x19, #0x38]
00b0dc38	str x0,[x19, #0xb8]
00b0dc3c	mov w0,wzr
00b0dc40	mov x1,x19
00b0dc44	str w22,[x19, #0xb0]
00b0dc48	blr x8
00b0dc4c	cbz w0,0x00b0dbd4
00b0dc50	str wzr,[x19, #0xac]
00b0dc54	cbnz x21,0x00b0dc68
00b0dc58	ldr x0,[x20]
00b0dc5c	mov w1,wzr
00b0dc60	bl 0x00c32610
00b0dc64	mov x21,x0
00b0dc68	ldr x8,[x19, #0x38]
00b0dc6c	mov w9,#0x41
00b0dc70	str x21,[x19, #0xb8]
00b0dc74	str w9,[x19, #0xb0]
00b0dc78	mov w0,wzr
00b0dc7c	mov x1,x19
00b0dc80	blr x8
00b0dc84	cmp w0,#0x0
00b0dc88	b.gt 0x00b0da18
00b0dc8c	b 0x00b0dbd4
00b0dc90	adrp x8,0x29b000
00b0dc94	ldr d0,[x8, #0xb90]
00b0dc98	str x21,[x19, #0xb8]
00b0dc9c	mov w0,#0xffffffff
00b0dca0	stur d0,[x19, #0xac]
00b0dca4	ldr w8,[x19, #0xb0]
00b0dca8	cbnz w8,0x00b0da18
00b0dcac	b 0x00b0dbdc
