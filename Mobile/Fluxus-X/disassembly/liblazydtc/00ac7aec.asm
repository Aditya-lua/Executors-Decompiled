; RAND_set_rand_method @ 00ac7aec
00ac7aec	str x21,[sp, #-0x30]!
00ac7af0	stp x20,x19,[sp, #0x10]
00ac7af4	mov x19,x0
00ac7af8	adrp x0,0xd22000
00ac7afc	adrp x1,0xac7000
00ac7b00	add x0,x0,#0x210
00ac7b04	add x1,x1,#0xbc0
00ac7b08	stp x29,x30,[sp, #0x20]
00ac7b0c	add x29,sp,#0x20
00ac7b10	bl 0x00c34d60
00ac7b14	mov w8,w0
00ac7b18	mov w0,wzr
00ac7b1c	cbz w8,0x00ac7b60
00ac7b20	adrp x8,0xd22000
00ac7b24	ldr w8,[x8, #0x214]
00ac7b28	cbz w8,0x00ac7b60
00ac7b2c	adrp x20,0xd22000
00ac7b30	ldr x0,[x20, #0x208]
00ac7b34	bl 0x00c356a0
00ac7b38	cbz w0,0x00ac7b60
00ac7b3c	adrp x21,0xd22000
00ac7b40	ldr x0,[x21, #0x218]
00ac7b44	bl 0x00c32360
00ac7b48	ldr x0,[x20, #0x208]
00ac7b4c	adrp x8,0xd22000
00ac7b50	str xzr,[x21, #0x218]
00ac7b54	str x19,[x8, #0x1f0]
00ac7b58	bl 0x00c35690
00ac7b5c	mov w0,#0x1
00ac7b60	ldp x29,x30,[sp, #0x20]
00ac7b64	ldp x20,x19,[sp, #0x10]
00ac7b68	ldr x21,[sp], #0x30
00ac7b6c	ret
