; i2b_PublicKey_bio @ 00b358c8
00b358c8	sub sp,sp,#0x30
00b358cc	stp x20,x19,[sp, #0x10]
00b358d0	mov x20,x0
00b358d4	add x0,sp,#0x8
00b358d8	mov w2,#0x1
00b358dc	stp x29,x30,[sp, #0x20]
00b358e0	add x29,sp,#0x20
00b358e4	str xzr,[sp, #0x8]
00b358e8	bl 0x00b36458
00b358ec	tbnz w0,#0x1f,0x00b3592c
00b358f0	ldr x1,[sp, #0x8]
00b358f4	mov w19,w0
00b358f8	mov x0,x20
00b358fc	mov w2,w19
00b35900	bl 0x00c34240
00b35904	ldr x8,[sp, #0x8]
00b35908	adrp x1,0x29e000
00b3590c	mov w20,w0
00b35910	add x1,x1,#0xe1c
00b35914	mov w2,#0x26a
00b35918	mov x0,x8
00b3591c	bl 0x00c32310
00b35920	cmp w20,w19
00b35924	csinv w0,w19,wzr,eq
00b35928	b 0x00b35930
00b3592c	mov w0,#0xffffffff
00b35930	ldp x29,x30,[sp, #0x20]
00b35934	ldp x20,x19,[sp, #0x10]
00b35938	add sp,sp,#0x30
00b3593c	ret
