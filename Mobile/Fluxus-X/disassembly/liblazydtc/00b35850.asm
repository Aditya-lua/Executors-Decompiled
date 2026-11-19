; i2b_PrivateKey_bio @ 00b35850
00b35850	sub sp,sp,#0x30
00b35854	stp x20,x19,[sp, #0x10]
00b35858	mov x20,x0
00b3585c	add x0,sp,#0x8
00b35860	mov w2,wzr
00b35864	stp x29,x30,[sp, #0x20]
00b35868	add x29,sp,#0x20
00b3586c	str xzr,[sp, #0x8]
00b35870	bl 0x00b36458
00b35874	tbnz w0,#0x1f,0x00b358b4
00b35878	ldr x1,[sp, #0x8]
00b3587c	mov w19,w0
00b35880	mov x0,x20
00b35884	mov w2,w19
00b35888	bl 0x00c34240
00b3588c	ldr x8,[sp, #0x8]
00b35890	adrp x1,0x29e000
00b35894	mov w20,w0
00b35898	add x1,x1,#0xe1c
00b3589c	mov w2,#0x26a
00b358a0	mov x0,x8
00b358a4	bl 0x00c32310
00b358a8	cmp w20,w19
00b358ac	csinv w0,w19,wzr,eq
00b358b0	b 0x00b358b8
00b358b4	mov w0,#0xffffffff
00b358b8	ldp x29,x30,[sp, #0x20]
00b358bc	ldp x20,x19,[sp, #0x10]
00b358c0	add sp,sp,#0x30
00b358c4	ret
