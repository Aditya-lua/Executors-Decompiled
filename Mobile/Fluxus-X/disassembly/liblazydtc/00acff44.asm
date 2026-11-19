; FUN_00acff44 @ 00acff44
00acff44	sub sp,sp,#0x80
00acff48	stp x28,x27,[sp, #0x20]
00acff4c	stp x26,x25,[sp, #0x30]
00acff50	stp x24,x23,[sp, #0x40]
00acff54	stp x22,x21,[sp, #0x50]
00acff58	stp x20,x19,[sp, #0x60]
00acff5c	stp x29,x30,[sp, #0x70]
00acff60	ldr x8,[x0, #0x40]
00acff64	add x29,sp,#0x70
00acff68	cbz x8,0x00acfff8
00acff6c	ldr x8,[x0, #0x48]
00acff70	mov x25,x0
00acff74	cbz x8,0x00acfff8
00acff78	ldr x8,[x25, #0x28]
00acff7c	cbz x8,0x00acfff8
00acff80	ldr x8,[x25, #0x30]
00acff84	cbz x8,0x00acfff8
00acff88	ldr x8,[x25, #0x38]
00acff8c	cbz x8,0x00acfff8
00acff90	ldr w8,[x25, #0x10]
00acff94	mov x28,x1
00acff98	mov w26,wzr
00acff9c	cmp w8,#0x1
00acffa0	b.ne 0x00ad004c
00acffa4	ldr x0,[x25, #0x88]
00acffa8	bl 0x00c325e0
00acffac	cmp w0,#0x1
00acffb0	b.lt 0x00acffd0
00acffb4	mov w26,w0
00acffb8	ldr x0,[x25, #0x28]
00acffbc	add w19,w26,#0x2
00acffc0	bl 0x00c322f0
00acffc4	bl 0x00c3fd60
00acffc8	cmp w19,w0
00acffcc	b.le 0x00ad004c
00acffd0	bl 0x00c342a0
00acffd4	adrp x0,0x29e000
00acffd8	adrp x2,0x2cc000
00acffdc	add x0,x0,#0x9a0
00acffe0	add x2,x2,#0xb
00acffe4	mov w1,#0x28
00acffe8	bl 0x00c342b0
00acffec	mov w0,#0x4
00acfff0	mov w1,#0xa7
00acfff4	b 0x00ad001c
00acfff8	bl 0x00c342a0
00acfffc	adrp x0,0x29e000
00ad0000	adrp x2,0x2cc000
00ad0004	add x0,x0,#0x9a0
00ad0008	add x2,x2,#0xb
00ad000c	orr w1,wzr,#0x1f
00ad0010	bl 0x00c342b0
00ad0014	mov w0,#0x4
00ad0018	mov w1,#0x93
00ad001c	mov x2,xzr
00ad0020	bl 0x00c342c0
00ad0024	mov w27,wzr
00ad0028	mov w0,w27
00ad002c	ldp x29,x30,[sp, #0x70]
00ad0030	ldp x20,x19,[sp, #0x60]
00ad0034	ldp x22,x21,[sp, #0x50]
00ad0038	ldp x24,x23,[sp, #0x40]
00ad003c	ldp x26,x25,[sp, #0x30]
00ad0040	ldp x28,x27,[sp, #0x20]
00ad0044	add sp,sp,#0x80
00ad0048	ret
00ad004c	bl 0x00c37710
00ad0050	mov x19,x0
00ad0054	bl 0x00c37710
00ad0058	mov x21,x0
00ad005c	bl 0x00c37710
00ad0060	mov x22,x0
00ad0064	bl 0x00c37710
00ad0068	mov x20,x0
00ad006c	bl 0x00c37710
00ad0070	ldr x8,[x25, #0x8]
00ad0074	mov x23,x0
00ad0078	mov x0,x8
00ad007c	bl 0x00c38a60
00ad0080	mov x24,x0
00ad0084	cbz x19,0x00ad00dc
00ad0088	cbz x21,0x00ad00dc
00ad008c	cbz x22,0x00ad00dc
00ad0090	cbz x20,0x00ad00dc
00ad0094	cbz x23,0x00ad00dc
00ad0098	cbz x24,0x00ad00dc
00ad009c	ldr x0,[x25, #0x30]
00ad00a0	bl 0x00c38d20
00ad00a4	cbz w0,0x00ad0110
00ad00a8	bl 0x00c342a0
00ad00ac	adrp x0,0x29e000
00ad00b0	adrp x2,0x2cc000
00ad00b4	add x0,x0,#0x9a0
00ad00b8	add x2,x2,#0xb
00ad00bc	orr w1,wzr,#0x3c
00ad00c0	bl 0x00c342b0
00ad00c4	mov w0,#0x4
00ad00c8	mov w1,#0x65
00ad00cc	mov x2,xzr
00ad00d0	bl 0x00c342c0
00ad00d4	mov w27,wzr
00ad00d8	b 0x00ad0114
00ad00dc	bl 0x00c342a0
00ad00e0	adrp x0,0x29e000
00ad00e4	adrp x2,0x2cc000
00ad00e8	add x0,x0,#0x9a0
00ad00ec	add x2,x2,#0xb
00ad00f0	mov w1,#0x36
00ad00f4	bl 0x00c342b0
00ad00f8	mov w1,#0x100
00ad00fc	mov w0,#0x4
00ad0100	movk w1,#0xc, LSL #16
00ad0104	mov x2,xzr
00ad0108	bl 0x00c342c0
00ad010c	b 0x00ad05ec
00ad0110	mov w27,#0x1
00ad0114	ldr x0,[x25, #0x30]
00ad0118	bl 0x00c38d10
00ad011c	cbnz w0,0x00ad0150
00ad0120	bl 0x00c342a0
00ad0124	adrp x0,0x29e000
00ad0128	adrp x2,0x2cc000
00ad012c	add x0,x0,#0x9a0
00ad0130	add x2,x2,#0xb
00ad0134	mov w1,#0x40
00ad0138	bl 0x00c342b0
00ad013c	mov w0,#0x4
00ad0140	mov w1,#0x65
00ad0144	mov x2,xzr
00ad0148	bl 0x00c342c0
00ad014c	mov w27,wzr
00ad0150	ldr x0,[x25, #0x40]
00ad0154	mov x1,x24
00ad0158	mov x2,x28
00ad015c	bl 0x00c39110
00ad0160	cmp w0,#0x1
00ad0164	b.eq 0x00ad0198
00ad0168	bl 0x00c342a0
00ad016c	adrp x0,0x29e000
00ad0170	adrp x2,0x2cc000
00ad0174	add x0,x0,#0x9a0
00ad0178	add x2,x2,#0xb
00ad017c	mov w1,#0x46
00ad0180	bl 0x00c342b0
00ad0184	mov w0,#0x4
00ad0188	mov w1,#0x80
00ad018c	mov x2,xzr
00ad0190	bl 0x00c342c0
00ad0194	mov w27,wzr
00ad0198	ldr x0,[x25, #0x48]
00ad019c	mov x1,x24
00ad01a0	mov x2,x28
00ad01a4	bl 0x00c39110
00ad01a8	cmp w0,#0x1
00ad01ac	b.eq 0x00ad01e0
00ad01b0	bl 0x00c342a0
00ad01b4	adrp x0,0x29e000
00ad01b8	adrp x2,0x2cc000
00ad01bc	add x0,x0,#0x9a0
00ad01c0	add x2,x2,#0xb
00ad01c4	mov w1,#0x4c
00ad01c8	bl 0x00c342b0
00ad01cc	mov w0,#0x4
00ad01d0	mov w1,#0x81
00ad01d4	mov x2,xzr
00ad01d8	bl 0x00c342c0
00ad01dc	mov w27,wzr
00ad01e0	cmp w26,#0x1
00ad01e4	stp x21,x20,[sp, #0x10]
00ad01e8	str x22,[sp, #0x8]
00ad01ec	b.lt 0x00ad025c
00ad01f0	adrp x21,0x29e000
00ad01f4	adrp x20,0x2cc000
00ad01f8	mov w22,wzr
00ad01fc	add x21,x21,#0x9a0
00ad0200	add x20,x20,#0xb
00ad0204	ldr x0,[x25, #0x88]
00ad0208	mov w1,w22
00ad020c	bl 0x00c32610
00ad0210	ldr x0,[x0]
00ad0214	mov x1,x24
00ad0218	mov x2,x28
00ad021c	bl 0x00c39110
00ad0220	cmp w0,#0x1
00ad0224	b.eq 0x00ad0250
00ad0228	bl 0x00c342a0
00ad022c	mov w1,#0x54
00ad0230	mov x0,x21
00ad0234	mov x2,x20
00ad0238	bl 0x00c342b0
00ad023c	mov w0,#0x4
00ad0240	mov w1,#0xaa
00ad0244	mov x2,xzr
00ad0248	bl 0x00c342c0
00ad024c	mov w27,wzr
00ad0250	add w22,w22,#0x1
00ad0254	cmp w26,w22
00ad0258	b.ne 0x00ad0204
00ad025c	ldp x1,x2,[x25, #0x40]
00ad0260	mov x0,x19
00ad0264	mov x3,x24
00ad0268	bl 0x00c39060
00ad026c	cbz w0,0x00ad05e4
00ad0270	ldp x22,x21,[sp, #0x8]
00ad0274	cmp w26,#0x1
00ad0278	b.lt 0x00ad02b0
00ad027c	mov w20,wzr
00ad0280	ldr x0,[x25, #0x88]
00ad0284	mov w1,w20
00ad0288	bl 0x00c32610
00ad028c	ldr x2,[x0]
00ad0290	mov x0,x19
00ad0294	mov x1,x19
00ad0298	mov x3,x24
00ad029c	bl 0x00c39060
00ad02a0	cbz w0,0x00ad05e8
00ad02a4	add w20,w20,#0x1
00ad02a8	cmp w20,w26
00ad02ac	b.lt 0x00ad0280
00ad02b0	ldr x1,[x25, #0x28]
00ad02b4	mov x0,x19
00ad02b8	bl 0x00c38cc0
00ad02bc	cbz w0,0x00ad0308
00ad02c0	bl 0x00c342a0
00ad02c4	adrp x0,0x29e000
00ad02c8	adrp x2,0x2cc000
00ad02cc	add x0,x0,#0x9a0
00ad02d0	add x2,x2,#0xb
00ad02d4	cbz w26,0x00ad02ec
00ad02d8	mov w1,#0x67
00ad02dc	bl 0x00c342b0
00ad02e0	mov w0,#0x4
00ad02e4	mov w1,#0xac
00ad02e8	b 0x00ad02fc
00ad02ec	mov w1,#0x69
00ad02f0	bl 0x00c342b0
00ad02f4	mov w0,#0x4
00ad02f8	orr w1,wzr,#0x7f
00ad02fc	mov x2,xzr
00ad0300	bl 0x00c342c0
00ad0304	mov w27,wzr
00ad0308	ldr x20,[x25, #0x40]
00ad030c	bl 0x00c38de0
00ad0310	mov x2,x0
00ad0314	mov x0,x19
00ad0318	mov x1,x20
00ad031c	bl 0x00c38880
00ad0320	cbz w0,0x00ad05e8
00ad0324	ldr x20,[x25, #0x48]
00ad0328	bl 0x00c38de0
00ad032c	mov x2,x0
00ad0330	mov x0,x21
00ad0334	mov x1,x20
00ad0338	bl 0x00c38880
00ad033c	cbz w0,0x00ad05e8
00ad0340	ldr x20,[sp, #0x18]
00ad0344	mov x1,x19
00ad0348	mov x2,x21
00ad034c	mov x3,x24
00ad0350	mov x0,x20
00ad0354	bl 0x00c39060
00ad0358	cbz w0,0x00ad05ec
00ad035c	mov x0,x23
00ad0360	mov x1,x19
00ad0364	mov x2,x21
00ad0368	mov x3,x24
00ad036c	bl 0x00c38b10
00ad0370	cbz w0,0x00ad05ec
00ad0374	mov x0,x23
00ad0378	mov x1,xzr
00ad037c	mov x2,x20
00ad0380	mov x3,x23
00ad0384	mov x4,x24
00ad0388	bl 0x00c38ab0
00ad038c	cbz w0,0x00ad05ec
00ad0390	cmp w26,#0x1
00ad0394	b.lt 0x00ad0420
00ad0398	mov w28,wzr
00ad039c	ldr x0,[x25, #0x88]
00ad03a0	mov w1,w28
00ad03a4	bl 0x00c32610
00ad03a8	ldr x20,[x0]
00ad03ac	bl 0x00c38de0
00ad03b0	mov x2,x0
00ad03b4	mov x0,x22
00ad03b8	mov x1,x20
00ad03bc	bl 0x00c38880
00ad03c0	cbz w0,0x00ad05e8
00ad03c4	ldr x20,[sp, #0x18]
00ad03c8	mov x1,x23
00ad03cc	mov x2,x22
00ad03d0	mov x3,x24
00ad03d4	mov x0,x20
00ad03d8	bl 0x00c39060
00ad03dc	cbz w0,0x00ad05ec
00ad03e0	mov x0,x23
00ad03e4	mov x1,x23
00ad03e8	mov x2,x22
00ad03ec	mov x3,x24
00ad03f0	bl 0x00c38b10
00ad03f4	cbz w0,0x00ad05ec
00ad03f8	mov x0,x23
00ad03fc	mov x1,xzr
00ad0400	mov x2,x20
00ad0404	mov x3,x23
00ad0408	mov x4,x24
00ad040c	bl 0x00c38ab0
00ad0410	cbz w0,0x00ad05ec
00ad0414	add w28,w28,#0x1
00ad0418	cmp w28,w26
00ad041c	b.lt 0x00ad039c
00ad0420	ldp x2,x1,[x25, #0x30]
00ad0424	mov x0,x19
00ad0428	mov x3,x23
00ad042c	mov x4,x24
00ad0430	bl 0x00c38ef0
00ad0434	cbz w0,0x00ad05ec
00ad0438	mov x0,x19
00ad043c	bl 0x00c38d20
00ad0440	cbnz w0,0x00ad0474
00ad0444	bl 0x00c342a0
00ad0448	adrp x0,0x29e000
00ad044c	adrp x2,0x2cc000
00ad0450	add x0,x0,#0x9a0
00ad0454	add x2,x2,#0xb
00ad0458	mov w1,#0x9d
00ad045c	bl 0x00c342b0
00ad0460	mov w0,#0x4
00ad0464	mov w1,#0x7b
00ad0468	mov x2,xzr
00ad046c	bl 0x00c342c0
00ad0470	mov w27,wzr
00ad0474	ldr x8,[x25, #0x50]
00ad0478	cbz x8,0x00ad0628
00ad047c	ldr x8,[x25, #0x58]
00ad0480	cbz x8,0x00ad0628
00ad0484	ldr x8,[x25, #0x60]
00ad0488	cbz x8,0x00ad0624
00ad048c	ldr x20,[x25, #0x40]
00ad0490	bl 0x00c38de0
00ad0494	mov x2,x0
00ad0498	mov x0,x19
00ad049c	mov x1,x20
00ad04a0	bl 0x00c38880
00ad04a4	cbz w0,0x00ad05e8
00ad04a8	ldr x2,[x25, #0x38]
00ad04ac	mov x0,xzr
00ad04b0	mov x1,x21
00ad04b4	mov x3,x19
00ad04b8	mov x4,x24
00ad04bc	bl 0x00c38ab0
00ad04c0	cbz w0,0x00ad05e4
00ad04c4	ldr x1,[x25, #0x50]
00ad04c8	ldr x0,[sp, #0x10]
00ad04cc	bl 0x00c38cc0
00ad04d0	cbz w0,0x00ad0504
00ad04d4	bl 0x00c342a0
00ad04d8	adrp x0,0x29e000
00ad04dc	adrp x2,0x2cc000
00ad04e0	add x0,x0,#0x9a0
00ad04e4	add x2,x2,#0xb
00ad04e8	mov w1,#0xac
00ad04ec	bl 0x00c342b0
00ad04f0	mov w0,#0x4
00ad04f4	orr w1,wzr,#0x7c
00ad04f8	mov x2,xzr
00ad04fc	bl 0x00c342c0
00ad0500	mov w27,wzr
00ad0504	ldr x20,[x25, #0x48]
00ad0508	bl 0x00c38de0
00ad050c	mov x2,x0
00ad0510	mov x0,x19
00ad0514	mov x1,x20
00ad0518	bl 0x00c38880
00ad051c	cbz w0,0x00ad05e4
00ad0520	ldr x2,[x25, #0x38]
00ad0524	ldr x1,[sp, #0x10]
00ad0528	mov x0,xzr
00ad052c	mov x3,x19
00ad0530	mov x4,x24
00ad0534	bl 0x00c38ab0
00ad0538	cbz w0,0x00ad05e4
00ad053c	ldr x1,[x25, #0x58]
00ad0540	ldr x0,[sp, #0x10]
00ad0544	bl 0x00c38cc0
00ad0548	cbz w0,0x00ad057c
00ad054c	bl 0x00c342a0
00ad0550	adrp x0,0x29e000
00ad0554	adrp x2,0x2cc000
00ad0558	add x0,x0,#0x9a0
00ad055c	add x2,x2,#0xb
00ad0560	mov w1,#0xba
00ad0564	bl 0x00c342b0
00ad0568	mov w0,#0x4
00ad056c	mov w1,#0x7d
00ad0570	mov x2,xzr
00ad0574	bl 0x00c342c0
00ad0578	mov w27,wzr
00ad057c	ldp x2,x1,[x25, #0x40]
00ad0580	mov x0,x19
00ad0584	mov x3,x24
00ad0588	bl 0x00c38b20
00ad058c	cbz x0,0x00ad05e4
00ad0590	ldr x1,[x25, #0x60]
00ad0594	mov x0,x19
00ad0598	bl 0x00c38cc0
00ad059c	ldp x22,x21,[sp, #0x8]
00ad05a0	ldr x20,[sp, #0x18]
00ad05a4	cbz w0,0x00ad0628
00ad05a8	bl 0x00c342a0
00ad05ac	adrp x0,0x29e000
00ad05b0	adrp x2,0x2cc000
00ad05b4	add x0,x0,#0x9a0
00ad05b8	add x2,x2,#0xb
00ad05bc	mov w1,#0xc4
00ad05c0	bl 0x00c342b0
00ad05c4	mov w0,#0x4
00ad05c8	orr w1,wzr,#0x7e
00ad05cc	mov x2,xzr
00ad05d0	bl 0x00c342c0
00ad05d4	mov w27,wzr
00ad05d8	cmp w26,#0x1
00ad05dc	b.ge 0x00ad0630
00ad05e0	b 0x00ad05f0
00ad05e4	ldp x22,x21,[sp, #0x8]
00ad05e8	ldr x20,[sp, #0x18]
00ad05ec	mov w27,#0xffffffff
00ad05f0	mov x0,x19
00ad05f4	bl 0x00c36290
00ad05f8	mov x0,x21
00ad05fc	bl 0x00c36290
00ad0600	mov x0,x22
00ad0604	bl 0x00c36290
00ad0608	mov x0,x20
00ad060c	bl 0x00c36290
00ad0610	mov x0,x23
00ad0614	bl 0x00c36290
00ad0618	mov x0,x24
00ad061c	bl 0x00c38a30
00ad0620	b 0x00ad0028
00ad0624	ldr x20,[sp, #0x18]
00ad0628	cmp w26,#0x1
00ad062c	b.lt 0x00ad05f0
00ad0630	mov w1,wzr
00ad0634	ldr x0,[x25, #0x88]
00ad0638	str w1,[sp, #0x10]
00ad063c	bl 0x00c32610
00ad0640	ldr x20,[x0]
00ad0644	mov x28,x0
00ad0648	bl 0x00c38de0
00ad064c	mov x2,x0
00ad0650	mov x0,x19
00ad0654	mov x1,x20
00ad0658	bl 0x00c38880
00ad065c	cbz w0,0x00ad05e8
00ad0660	ldr x2,[x25, #0x38]
00ad0664	mov x0,xzr
00ad0668	mov x1,x21
00ad066c	mov x3,x19
00ad0670	mov x4,x24
00ad0674	bl 0x00c38ab0
00ad0678	cbz w0,0x00ad05e8
00ad067c	ldr x1,[x28, #0x8]
00ad0680	mov x0,x21
00ad0684	bl 0x00c38cc0
00ad0688	ldr x20,[sp, #0x18]
00ad068c	cbz w0,0x00ad06c0
00ad0690	bl 0x00c342a0
00ad0694	adrp x0,0x29e000
00ad0698	adrp x2,0x2cc000
00ad069c	mov w1,#0xd5
00ad06a0	add x0,x0,#0x9a0
00ad06a4	add x2,x2,#0xb
00ad06a8	bl 0x00c342b0
00ad06ac	mov w0,#0x4
00ad06b0	mov w1,#0xa9
00ad06b4	mov x2,xzr
00ad06b8	bl 0x00c342c0
00ad06bc	mov w27,wzr
00ad06c0	ldr x1,[x28, #0x18]
00ad06c4	ldr x2,[x28]
00ad06c8	mov x0,x19
00ad06cc	mov x3,x24
00ad06d0	bl 0x00c38b20
00ad06d4	cbz x0,0x00ad05ec
00ad06d8	ldr x1,[x28, #0x10]
00ad06dc	mov x0,x19
00ad06e0	bl 0x00c38cc0
00ad06e4	cbz w0,0x00ad0718
00ad06e8	bl 0x00c342a0
00ad06ec	adrp x0,0x29e000
00ad06f0	adrp x2,0x2cc000
00ad06f4	mov w1,#0xde
00ad06f8	add x0,x0,#0x9a0
00ad06fc	add x2,x2,#0xb
00ad0700	bl 0x00c342b0
00ad0704	mov w0,#0x4
00ad0708	mov w1,#0xa8
00ad070c	mov x2,xzr
00ad0710	bl 0x00c342c0
00ad0714	mov w27,wzr
00ad0718	ldr w1,[sp, #0x10]
00ad071c	add w1,w1,#0x1
00ad0720	cmp w1,w26
00ad0724	b.lt 0x00ad0634
00ad0728	b 0x00ad05f0
