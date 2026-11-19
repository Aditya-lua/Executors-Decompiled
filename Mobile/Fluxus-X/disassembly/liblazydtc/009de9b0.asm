; tls_process_key_exchange @ 009de9b0
009de9b0	sub sp,sp,#0xa0
009de9b4	stp x28,x27,[sp, #0x40]
009de9b8	stp x26,x25,[sp, #0x50]
009de9bc	stp x24,x23,[sp, #0x60]
009de9c0	stp x22,x21,[sp, #0x70]
009de9c4	stp x20,x19,[sp, #0x80]
009de9c8	stp x29,x30,[sp, #0x90]
009de9cc	str xzr,[sp, #0x30]
009de9d0	ldr x8,[x0, #0x2e0]
009de9d4	mov x19,x0
009de9d8	ldr x0,[x0, #0x4b0]
009de9dc	ldp x20,x28,[x1]
009de9e0	ldr w25,[x8, #0x1c]
009de9e4	add x29,sp,#0x90
009de9e8	mov x21,x1
009de9ec	bl 0x00c32450
009de9f0	mov w8,#0x1c8
009de9f4	ands x27,x25,x8
009de9f8	str xzr,[x19, #0x4b0]
009de9fc	b.eq 0x009deb40
009dea00	ldr x8,[x21, #0x8]
009dea04	subs x8,x8,#0x2
009dea08	b.cc 0x009dea24
009dea0c	ldr x9,[x21]
009dea10	ldrb w10,[x9]
009dea14	ldrb w22,[x9, #0x1]
009dea18	bfm x22,x10,#0x38,#0x7
009dea1c	subs x8,x8,x22
009dea20	b.cs 0x009dea84
009dea24	bl 0x00c342a0
009dea28	adrp x0,0x2d7000
009dea2c	adrp x2,0x2c3000
009dea30	add x0,x0,#0xb1a
009dea34	add x2,x2,#0x639
009dea38	mov w1,#0x79d
009dea3c	bl 0x00c342b0
009dea40	mov w1,#0x32
009dea44	mov w2,#0x9f
009dea48	mov x0,x19
009dea4c	mov x3,xzr
009dea50	bl 0x00c34410
009dea54	mov x22,xzr
009dea58	mov x0,x22
009dea5c	bl 0x00c31f90
009dea60	mov w0,wzr
009dea64	ldp x29,x30,[sp, #0x90]
009dea68	ldp x20,x19,[sp, #0x80]
009dea6c	ldp x22,x21,[sp, #0x70]
009dea70	ldp x24,x23,[sp, #0x60]
009dea74	ldp x26,x25,[sp, #0x50]
009dea78	ldp x28,x27,[sp, #0x40]
009dea7c	add sp,sp,#0xa0
009dea80	ret
009dea84	add x23,x9,#0x2
009dea88	cmp x22,#0x101
009dea8c	add x9,x23,x22
009dea90	stp x9,x8,[x21]
009dea94	b.cc 0x009deac0
009dea98	bl 0x00c342a0
009dea9c	adrp x0,0x2d7000
009deaa0	adrp x2,0x2c3000
009deaa4	add x0,x0,#0xb1a
009deaa8	add x2,x2,#0x639
009deaac	mov w1,#0x7a8
009deab0	bl 0x00c342b0
009deab4	mov w1,#0x28
009deab8	mov w2,#0x92
009deabc	b 0x009dea48
009deac0	ldr x26,[x19, #0x918]
009deac4	ldr x0,[x26, #0x2a0]
009deac8	cbz x22,0x009deb28
009deacc	adrp x24,0x2d1000
009dead0	add x24,x24,#0x573
009dead4	mov w2,#0x1e3
009dead8	mov x1,x24
009deadc	bl 0x00c32310
009deae0	mov w3,#0x1e6
009deae4	mov x0,x23
009deae8	mov x1,x22
009deaec	mov x2,x24
009deaf0	bl 0x00c36180
009deaf4	str x0,[x26, #0x2a0]
009deaf8	cbnz x0,0x009deb40
009deafc	bl 0x00c342a0
009deb00	adrp x0,0x2d7000
009deb04	adrp x2,0x2c3000
009deb08	add x0,x0,#0xb1a
009deb0c	add x2,x2,#0x639
009deb10	mov w1,#0x7b1
009deb14	bl 0x00c342b0
009deb18	mov w2,#0x103
009deb1c	mov w1,#0x50
009deb20	movk w2,#0xc, LSL #16
009deb24	b 0x009dea48
009deb28	adrp x1,0x2d7000
009deb2c	add x1,x1,#0xb1a
009deb30	mov w2,#0x7ad
009deb34	bl 0x00c32310
009deb38	ldr x8,[x19, #0x918]
009deb3c	str xzr,[x8, #0x2a0]
009deb40	mov w8,#0x48
009deb44	tst x25,x8
009deb48	b.eq 0x009deb98
009deb4c	cbnz x27,0x009dec3c
009deb50	ldr x8,[x19, #0x2e0]
009deb54	mov w9,#0x44
009deb58	ldr w8,[x8, #0x20]
009deb5c	and w8,w8,w9
009deb60	cbnz w8,0x009dec3c
009deb64	mov x0,x19
009deb68	bl 0x009e0870
009deb6c	cbz w0,0x009dea54
009deb70	bl 0x00c342a0
009deb74	adrp x0,0x2d7000
009deb78	adrp x2,0x2c9000
009deb7c	add x0,x0,#0xb1a
009deb80	add x2,x2,#0x524
009deb84	mov w1,#0x90d
009deb88	bl 0x00c342b0
009deb8c	mov w1,#0x32
009deb90	mov w2,#0x186
009deb94	b 0x009dea48
009deb98	tbnz w25,#0x5,0x009dec6c
009deb9c	mov w8,#0x102
009deba0	tst x25,x8
009deba4	b.eq 0x009ded20
009deba8	str xzr,[sp, #0x38]
009debac	ldr x8,[x21, #0x8]
009debb0	subs x8,x8,#0x2
009debb4	b.cc 0x009dec20
009debb8	ldr x9,[x21]
009debbc	ldrb w10,[x9]
009debc0	ldrb w1,[x9, #0x1]
009debc4	bfm x1,x10,#0x38,#0x7
009debc8	subs x10,x8,x1
009debcc	b.cc 0x009dec20
009debd0	add x0,x9,#0x2
009debd4	subs x9,x10,#0x2
009debd8	add x8,x0,x1
009debdc	stp x8,x10,[x21]
009debe0	b.cc 0x009dec20
009debe4	ldrb w10,[x8]
009debe8	ldrb w23,[x8, #0x1]
009debec	bfm x23,x10,#0x38,#0x7
009debf0	subs x10,x9,x23
009debf4	b.cc 0x009dec20
009debf8	add x24,x8,#0x2
009debfc	subs x9,x10,#0x2
009dec00	add x8,x24,x23
009dec04	stp x8,x10,[x21]
009dec08	b.cc 0x009dec20
009dec0c	ldrb w10,[x8]
009dec10	ldrb w25,[x8, #0x1]
009dec14	bfm x25,x10,#0x38,#0x7
009dec18	subs x9,x9,x25
009dec1c	b.cs 0x009dee4c
009dec20	bl 0x00c342a0
009dec24	adrp x0,0x2d7000
009dec28	adrp x2,0x2db000
009dec2c	add x0,x0,#0xb1a
009dec30	add x2,x2,#0xca4
009dec34	mov w1,#0x7f6
009dec38	b 0x009dea3c
009dec3c	ldr x8,[x21, #0x8]
009dec40	cbz x8,0x009ded18
009dec44	bl 0x00c342a0
009dec48	adrp x0,0x2d7000
009dec4c	adrp x2,0x2c9000
009dec50	add x0,x0,#0xb1a
009dec54	add x2,x2,#0x524
009dec58	mov w1,#0x914
009dec5c	bl 0x00c342b0
009dec60	mov w1,#0x32
009dec64	mov w2,#0x99
009dec68	b 0x009dea48
009dec6c	ldr x8,[x21, #0x8]
009dec70	subs x8,x8,#0x2
009dec74	b.cc 0x009decfc
009dec78	ldr x9,[x21]
009dec7c	ldrb w10,[x9]
009dec80	ldrb w1,[x9, #0x1]
009dec84	bfm x1,x10,#0x38,#0x7
009dec88	subs x10,x8,x1
009dec8c	b.cc 0x009decfc
009dec90	add x0,x9,#0x2
009dec94	subs x9,x10,#0x2
009dec98	add x8,x0,x1
009dec9c	stp x8,x10,[x21]
009deca0	b.cc 0x009decfc
009deca4	ldrb w10,[x8]
009deca8	ldrb w23,[x8, #0x1]
009decac	bfm x23,x10,#0x38,#0x7
009decb0	subs x9,x9,x23
009decb4	b.cc 0x009decfc
009decb8	add x26,x8,#0x2
009decbc	add x22,x26,x23
009decc0	stp x22,x9,[x21]
009decc4	b.eq 0x009decfc
009decc8	ldrb w24,[x22], #0x1
009deccc	sub x8,x9,#0x1
009decd0	subs x10,x8,x24
009decd4	b.cc 0x009decfc
009decd8	add x8,x22,x24
009decdc	subs x9,x10,#0x2
009dece0	stp x8,x10,[x21]
009dece4	b.cc 0x009decfc
009dece8	ldrb w10,[x8]
009decec	ldrb w25,[x8, #0x1]
009decf0	bfm x25,x10,#0x38,#0x7
009decf4	subs x9,x9,x25
009decf8	b.cs 0x009df014
009decfc	bl 0x00c342a0
009ded00	adrp x0,0x2d7000
009ded04	adrp x2,0x2cb000
009ded08	add x0,x0,#0xb1a
009ded0c	add x2,x2,#0x640
009ded10	mov w1,#0x7c5
009ded14	b 0x009dea3c
009ded18	orr w0,wzr,#0x3
009ded1c	b 0x009dea64
009ded20	mov w8,#0x84
009ded24	tst x25,x8
009ded28	b.eq 0x009ded78
009ded2c	ldr x8,[x21, #0x8]
009ded30	cbz x8,0x009ded50
009ded34	ldr x10,[x21]
009ded38	sub x12,x8,#0x1
009ded3c	cmp x12,#0x1
009ded40	mov x11,x10
009ded44	ldrb w9,[x11], #0x1
009ded48	stp x11,x12,[x21]
009ded4c	b.hi 0x009deda4
009ded50	bl 0x00c342a0
009ded54	adrp x0,0x2d7000
009ded58	adrp x2,0x2db000
009ded5c	add x0,x0,#0xb1a
009ded60	add x2,x2,#0xcb8
009ded64	mov w1,#0x854
009ded68	bl 0x00c342b0
009ded6c	mov w1,#0x32
009ded70	mov w2,#0xa0
009ded74	b 0x009dea48
009ded78	cbz w25,0x009deb4c
009ded7c	bl 0x00c342a0
009ded80	adrp x0,0x2d7000
009ded84	adrp x2,0x2c9000
009ded88	add x0,x0,#0xb1a
009ded8c	add x2,x2,#0x524
009ded90	mov w1,#0x8ab
009ded94	bl 0x00c342b0
009ded98	mov w1,#0xa
009ded9c	mov w2,#0xf4
009deda0	b 0x009dea48
009deda4	ldrb w11,[x10, #0x1]
009deda8	ldrb w22,[x10, #0x2]
009dedac	add x10,x10,#0x3
009dedb0	sub x8,x8,#0x3
009dedb4	cmp w9,#0x3
009dedb8	stp x10,x8,[x21]
009dedbc	b.ne 0x009dee24
009dedc0	bfm w22,w11,#0x18,#0x7
009dedc4	mov w2,#0x1
009dedc8	mov x0,x19
009dedcc	mov w1,w22
009dedd0	bl 0x00c36720
009dedd4	cbz w0,0x009dee24
009dedd8	mov x0,x19
009deddc	mov w1,w22
009dede0	bl 0x00c349c0
009dede4	str x0,[x19, #0x4b0]
009dede8	cbz x0,0x009defec
009dedec	ldr x8,[x21, #0x8]
009dedf0	cbz x8,0x009dee08
009dedf4	ldr x1,[x21]
009dedf8	sub x8,x8,#0x1
009dedfc	ldrb w2,[x1], #0x1
009dee00	subs x8,x8,x2
009dee04	b.cs 0x009df0f8
009dee08	bl 0x00c342a0
009dee0c	adrp x0,0x2d7000
009dee10	adrp x2,0x2db000
009dee14	add x0,x0,#0xb1a
009dee18	add x2,x2,#0xcb8
009dee1c	mov w1,#0x868
009dee20	b 0x009dea3c
009dee24	bl 0x00c342a0
009dee28	adrp x0,0x2d7000
009dee2c	adrp x2,0x2db000
009dee30	add x0,x0,#0xb1a
009dee34	add x2,x2,#0xcb8
009dee38	mov w1,#0x85d
009dee3c	bl 0x00c342b0
009dee40	mov w1,#0x2f
009dee44	mov w2,#0x17a
009dee48	b 0x009dea48
009dee4c	add x26,x8,#0x2
009dee50	add x8,x26,x25
009dee54	mov x2,xzr
009dee58	stp x8,x9,[x21]
009dee5c	bl 0x00c36970
009dee60	mov x22,x0
009dee64	mov x0,x24
009dee68	mov w1,w23
009dee6c	mov x2,xzr
009dee70	bl 0x00c36970
009dee74	mov x23,x0
009dee78	mov x0,x26
009dee7c	mov w1,w25
009dee80	mov x2,xzr
009dee84	bl 0x00c36970
009dee88	stp x0,x23,[sp, #0x18]
009dee8c	str x22,[sp, #0x10]
009dee90	cbz x22,0x009df0b0
009dee94	cbz x23,0x009df0b0
009dee98	mov x24,x0
009dee9c	cbz x0,0x009df0b0
009deea0	bl 0x00c364c0
009deea4	mov x25,x0
009deea8	cbz x0,0x009df12c
009deeac	adrp x1,0x2a3000
009deeb0	add x1,x1,#0x8e7
009deeb4	mov x0,x25
009deeb8	mov x2,x22
009deebc	bl 0x00c364d0
009deec0	cbz w0,0x009df12c
009deec4	adrp x1,0x2d9000
009deec8	add x1,x1,#0x2e5
009deecc	mov x0,x25
009deed0	mov x2,x23
009deed4	bl 0x00c364d0
009deed8	cbz w0,0x009df12c
009deedc	adrp x1,0x2ad000
009deee0	add x1,x1,#0x463
009deee4	mov x0,x25
009deee8	mov x2,x24
009deeec	bl 0x00c364d0
009deef0	cbz w0,0x009df12c
009deef4	mov x0,x25
009deef8	bl 0x00c364f0
009deefc	str x0,[sp, #0x8]
009def00	cbz x0,0x009df12c
009def04	ldr x8,[x19, #0x9a8]
009def08	adrp x1,0x2a3000
009def0c	add x1,x1,#0xa5a
009def10	ldr x0,[x8]
009def14	ldr x2,[x8, #0x440]
009def18	bl 0x00c34630
009def1c	mov x24,x0
009def20	cbz x0,0x009df3b4
009def24	mov x0,x24
009def28	bl 0x00c36410
009def2c	cmp w0,#0x1
009def30	b.lt 0x009df390
009def34	ldr x3,[sp, #0x8]
009def38	add x1,sp,#0x38
009def3c	mov w2,#0x87
009def40	mov x0,x24
009def44	bl 0x00c36400
009def48	cmp w0,#0x0
009def4c	b.le 0x009df390
009def50	mov x0,x24
009def54	bl 0x00c34620
009def58	ldr x8,[x19, #0x9a8]
009def5c	ldr x1,[sp, #0x38]
009def60	ldr x0,[x8]
009def64	ldr x2,[x8, #0x440]
009def68	bl 0x00c34640
009def6c	mov x24,x0
009def70	cbz x0,0x009df3e0
009def74	mov x0,x24
009def78	bl 0x00c37140
009def7c	cmp w0,#0x1
009def80	b.ne 0x009df3e0
009def84	mov x0,x24
009def88	bl 0x00c37150
009def8c	cmp w0,#0x1
009def90	b.ne 0x009df3e0
009def94	ldr x0,[sp, #0x38]
009def98	bl 0x00c324c0
009def9c	ldr x4,[sp, #0x38]
009defa0	mov w1,#0x7
009defa4	mov w2,w0
009defa8	movk w1,#0x4, LSL #16
009defac	mov x0,x19
009defb0	mov w3,wzr
009defb4	bl 0x00c34a30
009defb8	cbz w0,0x009df554
009defbc	ldr x8,[sp, #0x38]
009defc0	str x8,[x19, #0x4b0]
009defc4	str xzr,[sp, #0x38]
009defc8	ldr x8,[x19, #0x2e0]
009defcc	ldrb w8,[x8, #0x20]
009defd0	tst w8,#0x3
009defd4	b.eq 0x009df5e0
009defd8	ldr x8,[x19, #0x918]
009defdc	ldr x0,[x8, #0x2b8]
009defe0	bl 0x00c32cb0
009defe4	mov x26,x0
009defe8	b 0x009df5e4
009defec	bl 0x00c342a0
009deff0	adrp x0,0x2d7000
009deff4	adrp x2,0x2db000
009deff8	add x0,x0,#0xb1a
009deffc	add x2,x2,#0xcb8
009df000	mov w1,#0x863
009df004	bl 0x00c342b0
009df008	mov w1,#0x50
009df00c	mov w2,#0x13a
009df010	b 0x009dea48
009df014	add x8,x8,#0x2
009df018	str x8,[sp, #0x20]
009df01c	add x8,x8,x25
009df020	mov x2,xzr
009df024	stp x8,x9,[x21]
009df028	bl 0x00c36970
009df02c	str x0,[x19, #0xbf8]
009df030	cbz x0,0x009df1b4
009df034	mov x0,x26
009df038	mov w1,w23
009df03c	mov x2,xzr
009df040	bl 0x00c36970
009df044	str x0,[x19, #0xc00]
009df048	cbz x0,0x009df1b4
009df04c	mov x0,x22
009df050	mov w1,w24
009df054	mov x2,xzr
009df058	bl 0x00c36970
009df05c	str x0,[x19, #0xc08]
009df060	cbz x0,0x009df1b4
009df064	ldr x0,[sp, #0x20]
009df068	mov w1,w25
009df06c	mov x2,xzr
009df070	bl 0x00c36970
009df074	str x0,[x19, #0xc10]
009df078	cbz x0,0x009df1b4
009df07c	mov x0,x19
009df080	bl 0x00c36aa0
009df084	cbz w0,0x009dea54
009df088	ldr x8,[x19, #0x2e0]
009df08c	ldrb w8,[x8, #0x20]
009df090	tst w8,#0x3
009df094	b.eq 0x009deb4c
009df098	ldr x8,[x19, #0x918]
009df09c	ldr x0,[x8, #0x2b8]
009df0a0	bl 0x00c32cb0
009df0a4	mov x26,x0
009df0a8	cbnz x26,0x009df228
009df0ac	b 0x009deb4c
009df0b0	bl 0x00c342a0
009df0b4	adrp x0,0x2d7000
009df0b8	adrp x2,0x2db000
009df0bc	add x0,x0,#0xb1a
009df0c0	add x2,x2,#0xca4
009df0c4	mov w1,#0x800
009df0c8	bl 0x00c342b0
009df0cc	mov w2,#0x3
009df0d0	mov w1,#0x50
009df0d4	movk w2,#0x8, LSL #16
009df0d8	mov x0,x19
009df0dc	mov x3,xzr
009df0e0	bl 0x00c34410
009df0e4	mov x26,xzr
009df0e8	mov x24,xzr
009df0ec	mov x22,xzr
009df0f0	mov x25,xzr
009df0f4	b 0x009df16c
009df0f8	add x9,x1,x2
009df0fc	stp x9,x8,[x21]
009df100	ldr x0,[x19, #0x4b0]
009df104	bl 0x00c36460
009df108	cmp w0,#0x0
009df10c	b.le 0x009df1e0
009df110	ldr x8,[x19, #0x2e0]
009df114	ldr w8,[x8, #0x20]
009df118	tbnz w8,#0x3,0x009df208
009df11c	mov x26,xzr
009df120	add x23,x19,#0x918
009df124	tbnz w8,#0x0,0x009df20c
009df128	b 0x009df21c
009df12c	bl 0x00c342a0
009df130	adrp x0,0x2d7000
009df134	adrp x2,0x2db000
009df138	add x0,x0,#0xb1a
009df13c	add x2,x2,#0xca4
009df140	mov w1,#0x80b
009df144	bl 0x00c342b0
009df148	mov w2,#0x103
009df14c	mov w1,#0x50
009df150	movk w2,#0xc, LSL #16
009df154	mov x0,x19
009df158	mov x3,xzr
009df15c	bl 0x00c34410
009df160	mov x26,xzr
009df164	mov x24,xzr
009df168	mov x22,xzr
009df16c	mov w23,#0x1
009df170	mov x0,x25
009df174	bl 0x00c364b0
009df178	mov x0,x22
009df17c	bl 0x00c36500
009df180	ldr x0,[sp, #0x38]
009df184	bl 0x00c32450
009df188	mov x0,x24
009df18c	bl 0x00c34620
009df190	ldr x0,[sp, #0x10]
009df194	bl 0x00c36290
009df198	ldr x0,[sp, #0x20]
009df19c	bl 0x00c36290
009df1a0	ldr x0,[sp, #0x18]
009df1a4	bl 0x00c36290
009df1a8	mov x22,xzr
009df1ac	tbnz w23,#0x0,0x009dea58
009df1b0	b 0x009df224
009df1b4	bl 0x00c342a0
009df1b8	adrp x0,0x2d7000
009df1bc	adrp x2,0x2cb000
009df1c0	add x0,x0,#0xb1a
009df1c4	add x2,x2,#0x640
009df1c8	mov w1,#0x7d5
009df1cc	bl 0x00c342b0
009df1d0	mov w2,#0x3
009df1d4	mov w1,#0x50
009df1d8	movk w2,#0x8, LSL #16
009df1dc	b 0x009dea48
009df1e0	bl 0x00c342a0
009df1e4	adrp x0,0x2d7000
009df1e8	adrp x2,0x2db000
009df1ec	add x0,x0,#0xb1a
009df1f0	add x2,x2,#0xcb8
009df1f4	mov w1,#0x86f
009df1f8	bl 0x00c342b0
009df1fc	mov w1,#0x2f
009df200	mov w2,#0x132
009df204	b 0x009dea48
009df208	add x23,x19,#0x918
009df20c	ldr x8,[x23]
009df210	ldr x0,[x8, #0x2b8]
009df214	bl 0x00c32cb0
009df218	mov x26,x0
009df21c	ldr x8,[x23]
009df220	str w22,[x8, #0x308]
009df224	cbz x26,0x009deb4c
009df228	str xzr,[sp, #0x38]
009df22c	ldr x8,[x21, #0x8]
009df230	subs x23,x28,x8
009df234	b.mi 0x009df288
009df238	cmp x28,x23
009df23c	b.cc 0x009df288
009df240	ldr x9,[x19, #0x8]
009df244	ldr x9,[x9, #0xc0]
009df248	ldrb w9,[x9, #0x60]
009df24c	tbnz w9,#0x1,0x009df2b4
009df250	mov x0,x19
009df254	mov x1,x26
009df258	bl 0x00c36790
009df25c	cbnz w0,0x009df304
009df260	bl 0x00c342a0
009df264	adrp x0,0x2d7000
009df268	adrp x2,0x2c9000
009df26c	add x0,x0,#0xb1a
009df270	add x2,x2,#0x524
009df274	mov w1,#0x8cf
009df278	bl 0x00c342b0
009df27c	mov w1,#0x50
009df280	mov w2,#0x14d
009df284	b 0x009dea48
009df288	bl 0x00c342a0
009df28c	adrp x0,0x2d7000
009df290	adrp x2,0x2c9000
009df294	add x0,x0,#0xb1a
009df298	add x2,x2,#0x524
009df29c	mov w1,#0x8be
009df2a0	bl 0x00c342b0
009df2a4	mov w2,#0x103
009df2a8	mov w1,#0x32
009df2ac	movk w2,#0xc, LSL #16
009df2b0	b 0x009dea48
009df2b4	cmp x8,#0x1
009df2b8	b.hi 0x009df2d8
009df2bc	bl 0x00c342a0
009df2c0	adrp x0,0x2d7000
009df2c4	adrp x2,0x2c9000
009df2c8	add x0,x0,#0xb1a
009df2cc	add x2,x2,#0x524
009df2d0	mov w1,#0x8c6
009df2d4	b 0x009ded68
009df2d8	ldr x9,[x21]
009df2dc	sub x8,x8,#0x2
009df2e0	mov x0,x19
009df2e4	mov x2,x26
009df2e8	ldrh w10,[x9], #0x2
009df2ec	rev w10,w10
009df2f0	lsr w1,w10,#0x10
009df2f4	stp x9,x8,[x21]
009df2f8	bl 0x00c366b0
009df2fc	cmp w0,#0x1
009df300	b.lt 0x009dea54
009df304	ldr x0,[x19, #0x9a8]
009df308	ldr x1,[x19, #0x3b0]
009df30c	add x2,sp,#0x38
009df310	bl 0x00c36750
009df314	cbz w0,0x009df368
009df318	ldr x8,[x21, #0x8]
009df31c	subs x8,x8,#0x2
009df320	b.cc 0x009df34c
009df324	ldr x9,[x21]
009df328	ldrb w10,[x9]
009df32c	ldrb w24,[x9, #0x1]
009df330	bfm x24,x10,#0x38,#0x7
009df334	subs x8,x8,x24
009df338	b.cc 0x009df34c
009df33c	add x25,x9,#0x2
009df340	add x9,x25,x24
009df344	stp x9,x8,[x21]
009df348	b.eq 0x009df420
009df34c	bl 0x00c342a0
009df350	adrp x0,0x2d7000
009df354	adrp x2,0x2c9000
009df358	add x0,x0,#0xb1a
009df35c	add x2,x2,#0x524
009df360	mov w1,#0x8de
009df364	b 0x009dea3c
009df368	bl 0x00c342a0
009df36c	adrp x0,0x2d7000
009df370	adrp x2,0x2c9000
009df374	add x0,x0,#0xb1a
009df378	add x2,x2,#0x524
009df37c	mov w1,#0x8d5
009df380	bl 0x00c342b0
009df384	mov w1,#0x50
009df388	mov w2,#0x129
009df38c	b 0x009dea48
009df390	bl 0x00c342a0
009df394	adrp x0,0x2d7000
009df398	adrp x2,0x2db000
009df39c	add x0,x0,#0xb1a
009df3a0	add x2,x2,#0xca4
009df3a4	mov w1,#0x816
009df3a8	bl 0x00c342b0
009df3ac	mov w1,#0x50
009df3b0	b 0x009df400
009df3b4	bl 0x00c342a0
009df3b8	adrp x0,0x2d7000
009df3bc	adrp x2,0x2db000
009df3c0	add x0,x0,#0xb1a
009df3c4	add x2,x2,#0xca4
009df3c8	mov w1,#0x811
009df3cc	bl 0x00c342b0
009df3d0	mov w2,#0x103
009df3d4	mov w1,#0x50
009df3d8	movk w2,#0xc, LSL #16
009df3dc	b 0x009df404
009df3e0	bl 0x00c342a0
009df3e4	adrp x0,0x2d7000
009df3e8	adrp x2,0x2db000
009df3ec	add x0,x0,#0xb1a
009df3f0	add x2,x2,#0xca4
009df3f4	mov w1,#0x825
009df3f8	bl 0x00c342b0
009df3fc	mov w1,#0x2f
009df400	mov w2,#0x66
009df404	mov x0,x19
009df408	mov x3,xzr
009df40c	bl 0x00c34410
009df410	mov x26,xzr
009df414	mov w23,#0x1
009df418	ldr x22,[sp, #0x8]
009df41c	b 0x009df170
009df420	bl 0x00c31fa0
009df424	mov x22,x0
009df428	cbz x0,0x009df440
009df42c	ldr x0,[sp, #0x38]
009df430	cbz x0,0x009df46c
009df434	bl 0x00c36230
009df438	mov x2,x0
009df43c	b 0x009df470
009df440	bl 0x00c342a0
009df444	adrp x0,0x2d7000
009df448	adrp x2,0x2c9000
009df44c	add x0,x0,#0xb1a
009df450	add x2,x2,#0x524
009df454	mov w1,#0x8e4
009df458	bl 0x00c342b0
009df45c	mov w8,#0x103
009df460	movk w8,#0xc, LSL #16
009df464	sub w2,w8,#0x3
009df468	b 0x009df5a4
009df46c	mov x2,xzr
009df470	ldr x8,[x19, #0x9a8]
009df474	add x1,sp,#0x30
009df478	mov x0,x22
009df47c	mov x5,x26
009df480	ldr x3,[x8]
009df484	ldr x4,[x8, #0x440]
009df488	mov x6,xzr
009df48c	bl 0x00c370e0
009df490	cmp w0,#0x0
009df494	b.le 0x009df538
009df498	ldr x8,[x19, #0x3b0]
009df49c	cbz x8,0x009df4d4
009df4a0	ldr w8,[x8, #0x14]
009df4a4	cmp w8,#0x390
009df4a8	b.ne 0x009df4d4
009df4ac	ldr x0,[sp, #0x30]
009df4b0	orr w1,wzr,#0x6
009df4b4	bl 0x00c37100
009df4b8	cmp w0,#0x1
009df4bc	b.lt 0x009df57c
009df4c0	ldr x0,[sp, #0x30]
009df4c4	mov w1,#0xffffffff
009df4c8	bl 0x00c37110
009df4cc	cmp w0,#0x0
009df4d0	b.le 0x009df57c
009df4d4	add x1,sp,#0x28
009df4d8	mov x0,x19
009df4dc	mov x2,x20
009df4e0	mov x3,x23
009df4e4	bl 0x00c37160
009df4e8	cbz x0,0x009dea58
009df4ec	ldr x3,[sp, #0x28]
009df4f0	mov x4,x0
009df4f4	mov x0,x22
009df4f8	mov x1,x25
009df4fc	mov x2,x24
009df500	bl 0x00c370d0
009df504	ldr x8,[sp, #0x28]
009df508	adrp x1,0x2d7000
009df50c	mov w20,w0
009df510	add x1,x1,#0xb1a
009df514	mov w2,#0x900
009df518	mov x0,x8
009df51c	bl 0x00c32310
009df520	cmp w20,#0x0
009df524	b.le 0x009df5b8
009df528	mov x0,x22
009df52c	bl 0x00c31f90
009df530	orr w0,wzr,#0x3
009df534	b 0x009dea64
009df538	bl 0x00c342a0
009df53c	adrp x0,0x2d7000
009df540	adrp x2,0x2c9000
009df544	add x0,x0,#0xb1a
009df548	add x2,x2,#0x524
009df54c	mov w1,#0x8ec
009df550	b 0x009df594
009df554	bl 0x00c342a0
009df558	adrp x0,0x2d7000
009df55c	adrp x2,0x2db000
009df560	add x0,x0,#0xb1a
009df564	add x2,x2,#0xca4
009df568	mov w1,#0x82c
009df56c	bl 0x00c342b0
009df570	mov w1,#0x28
009df574	mov w2,#0x18a
009df578	b 0x009df404
009df57c	bl 0x00c342a0
009df580	adrp x0,0x2d7000
009df584	adrp x2,0x2c9000
009df588	add x0,x0,#0xb1a
009df58c	add x2,x2,#0x524
009df590	mov w1,#0x8f3
009df594	bl 0x00c342b0
009df598	mov w8,#0x3
009df59c	movk w8,#0x8, LSL #16
009df5a0	add w2,w8,#0x3
009df5a4	mov w1,#0x50
009df5a8	mov x0,x19
009df5ac	mov x3,xzr
009df5b0	bl 0x00c34410
009df5b4	b 0x009dea58
009df5b8	bl 0x00c342a0
009df5bc	adrp x0,0x2d7000
009df5c0	adrp x2,0x2c9000
009df5c4	add x0,x0,#0xb1a
009df5c8	add x2,x2,#0x524
009df5cc	mov w1,#0x902
009df5d0	bl 0x00c342b0
009df5d4	mov w1,#0x33
009df5d8	mov w2,#0x7b
009df5dc	b 0x009df5a8
009df5e0	mov x26,xzr
009df5e4	mov w23,wzr
009df5e8	b 0x009df418
