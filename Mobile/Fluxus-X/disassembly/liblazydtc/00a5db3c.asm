; evp_default_properties_enable_fips_int @ 00a5db3c
00a5db3c	stp x22,x21,[sp, #-0x30]!
00a5db40	adrp x8,0x2b5000
00a5db44	adrp x9,0x2a4000
00a5db48	add x8,x8,#0xc3a
00a5db4c	add x9,x9,#0x5d
00a5db50	cmp w1,#0x0
00a5db54	mov w1,w2
00a5db58	stp x20,x19,[sp, #0x10]
00a5db5c	stp x29,x30,[sp, #0x20]
00a5db60	add x29,sp,#0x20
00a5db64	mov x19,x0
00a5db68	csel x20,x9,x8,eq
00a5db6c	bl 0x00c3cde0
00a5db70	cbz x0,0x00a5dbdc
00a5db74	ldr x8,[x0]
00a5db78	mov x21,x0
00a5db7c	cbz x8,0x00a5dbdc
00a5db80	mov w2,#0x1
00a5db84	mov x0,x19
00a5db88	mov x1,x20
00a5db8c	bl 0x00c3ce10
00a5db90	cbz x0,0x00a5dc3c
00a5db94	ldr x1,[x21]
00a5db98	mov x22,x0
00a5db9c	bl 0x00c3ce40
00a5dba0	mov x20,x0
00a5dba4	mov x0,x22
00a5dba8	bl 0x00c3b670
00a5dbac	cbnz x20,0x00a5dbf4
00a5dbb0	bl 0x00c342a0
00a5dbb4	adrp x0,0x29e000
00a5dbb8	adrp x2,0x2af000
00a5dbbc	add x0,x0,#0x17d
00a5dbc0	add x2,x2,#0xfa3
00a5dbc4	mov w1,#0x23f
00a5dbc8	bl 0x00c342b0
00a5dbcc	mov w1,#0x100
00a5dbd0	orr w0,wzr,#0x6
00a5dbd4	movk w1,#0xc, LSL #16
00a5dbd8	b 0x00a5dc60
00a5dbdc	mov w2,#0x1
00a5dbe0	mov x0,x19
00a5dbe4	mov x1,x20
00a5dbe8	bl 0x00c3ce10
00a5dbec	cbz x0,0x00a5dc14
00a5dbf0	mov x20,x0
00a5dbf4	mov x0,x19
00a5dbf8	mov x1,x20
00a5dbfc	mov w2,wzr
00a5dc00	mov w3,wzr
00a5dc04	bl 0x00a5d95c
00a5dc08	cbz w0,0x00a5dc30
00a5dc0c	mov w0,#0x1
00a5dc10	b 0x00a5dc6c
00a5dc14	bl 0x00c342a0
00a5dc18	adrp x0,0x29e000
00a5dc1c	adrp x2,0x2b7000
00a5dc20	add x0,x0,#0x17d
00a5dc24	add x2,x2,#0xc8b
00a5dc28	mov w1,#0x21f
00a5dc2c	b 0x00a5dc54
00a5dc30	mov x0,x20
00a5dc34	bl 0x00c3b670
00a5dc38	b 0x00a5dc68
00a5dc3c	bl 0x00c342a0
00a5dc40	adrp x0,0x29e000
00a5dc44	adrp x2,0x2af000
00a5dc48	add x0,x0,#0x17d
00a5dc4c	add x2,x2,#0xfa3
00a5dc50	mov w1,#0x239
00a5dc54	bl 0x00c342b0
00a5dc58	orr w0,wzr,#0x6
00a5dc5c	mov w1,#0xd2
00a5dc60	mov x2,xzr
00a5dc64	bl 0x00c342c0
00a5dc68	mov w0,wzr
00a5dc6c	ldp x29,x30,[sp, #0x20]
00a5dc70	ldp x20,x19,[sp, #0x10]
00a5dc74	ldp x22,x21,[sp], #0x30
00a5dc78	ret
