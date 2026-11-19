; PKCS12_PBE_keyivgen_ex @ 00aba234
00aba234	sub sp,sp,#0xe0
00aba238	stp x28,x27,[sp, #0x80]
00aba23c	stp x26,x25,[sp, #0x90]
00aba240	stp x24,x23,[sp, #0xa0]
00aba244	stp x22,x21,[sp, #0xb0]
00aba248	stp x20,x19,[sp, #0xc0]
00aba24c	stp x29,x30,[sp, #0xd0]
00aba250	add x29,sp,#0xd0
00aba254	cbz x4,0x00aba2ac
00aba258	mov x23,x7
00aba25c	mov w20,w6
00aba260	mov x24,x5
00aba264	mov x21,x4
00aba268	mov x19,x3
00aba26c	mov w25,w2
00aba270	mov x26,x1
00aba274	mov x22,x0
00aba278	bl 0x00c37e00
00aba27c	mov x1,x19
00aba280	bl 0x00c37a80
00aba284	mov x19,x0
00aba288	cbz x0,0x00aba2b4
00aba28c	str x22,[sp, #0x20]
00aba290	ldr x0,[x19, #0x8]
00aba294	ldr x22,[x29, #0x10]
00aba298	str w20,[sp, #0x2c]
00aba29c	cbz x0,0x00aba2e4
00aba2a0	bl 0x00c37580
00aba2a4	mov x27,x0
00aba2a8	b 0x00aba2e8
00aba2ac	mov w19,wzr
00aba2b0	b 0x00aba420
00aba2b4	bl 0x00c342a0
00aba2b8	adrp x0,0x29e000
00aba2bc	adrp x2,0x2d4000
00aba2c0	add x0,x0,#0x8e0
00aba2c4	add x2,x2,#0x321
00aba2c8	mov w1,#0x29
00aba2cc	bl 0x00c342b0
00aba2d0	mov w0,#0x23
00aba2d4	mov w1,#0x65
00aba2d8	mov x2,xzr
00aba2dc	bl 0x00c342c0
00aba2e0	b 0x00aba420
00aba2e4	mov w27,#0x1
00aba2e8	ldr x8,[x19]
00aba2ec	mov x0,x21
00aba2f0	ldr x28,[x8, #0x8]
00aba2f4	ldr w20,[x8]
00aba2f8	bl 0x00c34bd0
00aba2fc	mov w6,w0
00aba300	mov w4,#0x1
00aba304	add x7,sp,#0x40
00aba308	mov x0,x26
00aba30c	mov w1,w25
00aba310	mov x2,x28
00aba314	mov w3,w20
00aba318	mov w5,w27
00aba31c	stp x23,x22,[sp, #0x8]
00aba320	str x24,[sp]
00aba324	bl 0x00c3f470
00aba328	cbz w0,0x00aba3a0
00aba32c	mov x0,x21
00aba330	bl 0x00c34bc0
00aba334	cmp w0,#0x1
00aba338	b.lt 0x00aba3dc
00aba33c	mov x0,x21
00aba340	bl 0x00c34bc0
00aba344	mov w6,w0
00aba348	mov w4,#0x2
00aba34c	add x7,sp,#0x30
00aba350	mov x0,x26
00aba354	mov w1,w25
00aba358	mov x2,x28
00aba35c	mov w3,w20
00aba360	mov w5,w27
00aba364	stp x23,x22,[sp, #0x8]
00aba368	str x24,[sp]
00aba36c	add x20,sp,#0x30
00aba370	bl 0x00c3f470
00aba374	cbnz w0,0x00aba3e0
00aba378	bl 0x00c342a0
00aba37c	adrp x0,0x29e000
00aba380	adrp x2,0x2d4000
00aba384	add x0,x0,#0x8e0
00aba388	add x2,x2,#0x321
00aba38c	mov w1,#0x40
00aba390	bl 0x00c342b0
00aba394	mov w0,#0x23
00aba398	mov w1,#0x6a
00aba39c	b 0x00aba3c4
00aba3a0	bl 0x00c342a0
00aba3a4	adrp x0,0x29e000
00aba3a8	adrp x2,0x2d4000
00aba3ac	add x0,x0,#0x8e0
00aba3b0	add x2,x2,#0x321
00aba3b4	mov w1,#0x37
00aba3b8	bl 0x00c342b0
00aba3bc	mov w0,#0x23
00aba3c0	mov w1,#0x6b
00aba3c4	mov x2,xzr
00aba3c8	bl 0x00c342c0
00aba3cc	mov x0,x19
00aba3d0	bl 0x00c37df0
00aba3d4	mov w19,wzr
00aba3d8	b 0x00aba420
00aba3dc	mov x20,xzr
00aba3e0	mov x0,x19
00aba3e4	bl 0x00c37df0
00aba3e8	ldr x0,[sp, #0x20]
00aba3ec	ldr w5,[sp, #0x2c]
00aba3f0	add x3,sp,#0x40
00aba3f4	mov x1,x21
00aba3f8	mov x2,xzr
00aba3fc	mov x4,x20
00aba400	bl 0x00c34be0
00aba404	mov w19,w0
00aba408	add x0,sp,#0x40
00aba40c	mov w1,#0x40
00aba410	bl 0x00c34750
00aba414	add x0,sp,#0x30
00aba418	mov w1,#0x10
00aba41c	bl 0x00c34750
00aba420	mov w0,w19
00aba424	ldp x29,x30,[sp, #0xd0]
00aba428	ldp x20,x19,[sp, #0xc0]
00aba42c	ldp x22,x21,[sp, #0xb0]
00aba430	ldp x24,x23,[sp, #0xa0]
00aba434	ldp x26,x25,[sp, #0x90]
00aba438	ldp x28,x27,[sp, #0x80]
00aba43c	add sp,sp,#0xe0
00aba440	ret
