; FUN_00aad21c @ 00aad21c
00aad21c	stp x20,x19,[sp, #-0x20]!
00aad220	adrp x19,0xd22000
00aad224	stp x29,x30,[sp, #0x10]
00aad228	add x29,sp,#0x10
00aad22c	str xzr,[x19, #0x178]
00aad230	bl 0x00c34d50
00aad234	adrp x20,0xd22000
00aad238	str x0,[x20, #0x168]
00aad23c	cbz x0,0x00aad26c
00aad240	adrp x0,0xaad000
00aad244	adrp x1,0xaad000
00aad248	add x0,x0,#0xa20
00aad24c	add x1,x1,#0xa84
00aad250	bl 0x00c34dd0
00aad254	ldr x8,[x20, #0x168]
00aad258	str x0,[x19, #0x178]
00aad25c	cbz x0,0x00aad278
00aad260	cmp x8,#0x0
00aad264	cset w8,ne
00aad268	b 0x00aad28c
00aad26c	ldr x0,[x19, #0x178]
00aad270	mov x8,xzr
00aad274	cbnz x0,0x00aad260
00aad278	mov x0,x8
00aad27c	bl 0x00c34d40
00aad280	ldr x0,[x19, #0x178]
00aad284	mov w8,wzr
00aad288	str xzr,[x20, #0x168]
00aad28c	cmp x0,#0x0
00aad290	ldp x29,x30,[sp, #0x10]
00aad294	cset w9,ne
00aad298	and w8,w8,w9
00aad29c	adrp x9,0xd22000
00aad2a0	str w8,[x9, #0x164]
00aad2a4	ldp x20,x19,[sp], #0x20
00aad2a8	ret
