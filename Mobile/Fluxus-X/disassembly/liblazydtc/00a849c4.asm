; FUN_00a849c4 @ 00a849c4
00a849c4	stp x20,x19,[sp, #-0x20]!
00a849c8	stp x29,x30,[sp, #0x10]
00a849cc	add x29,sp,#0x10
00a849d0	bl 0x00c34d50
00a849d4	adrp x19,0xd22000
00a849d8	str x0,[x19, #0x8]
00a849dc	cbz x0,0x00a84a20
00a849e0	bl 0x00c34d50
00a849e4	adrp x8,0xd22000
00a849e8	str x0,[x8, #0x10]
00a849ec	cbz x0,0x00a84a20
00a849f0	bl 0x00c3e000
00a849f4	bl 0x00c3e140
00a849f8	cbz w0,0x00a84a20
00a849fc	adrp x0,0xd22000
00a84a00	add x0,x0,#0x18
00a84a04	mov x1,xzr
00a84a08	bl 0x00c38370
00a84a0c	cbz w0,0x00a84a20
00a84a10	adrp x9,0xd21000
00a84a14	mov w8,#0x1
00a84a18	strb w8,[x9, #0xff8]
00a84a1c	b 0x00a84a40
00a84a20	ldr x0,[x19, #0x8]
00a84a24	bl 0x00c34d40
00a84a28	adrp x20,0xd22000
00a84a2c	ldr x0,[x20, #0x10]
00a84a30	str xzr,[x19, #0x8]
00a84a34	bl 0x00c34d40
00a84a38	mov w8,wzr
00a84a3c	str xzr,[x20, #0x10]
00a84a40	ldp x29,x30,[sp, #0x10]
00a84a44	adrp x9,0xd22000
00a84a48	str w8,[x9, #0x2c]
00a84a4c	ldp x20,x19,[sp], #0x20
00a84a50	ret
