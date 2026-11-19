; EVP_RAND_CTX_set_params @ 00ac9aa0
00ac9aa0	stp x20,x19,[sp, #-0x20]!
00ac9aa4	stp x29,x30,[sp, #0x10]
00ac9aa8	ldr x8,[x0]
00ac9aac	mov x19,x0
00ac9ab0	mov x20,x1
00ac9ab4	add x29,sp,#0x10
00ac9ab8	ldr x9,[x8, #0x78]
00ac9abc	cbz x9,0x00ac9ad0
00ac9ac0	ldr x0,[x19, #0x8]
00ac9ac4	blr x9
00ac9ac8	cbz w0,0x00ac9b10
00ac9acc	ldr x8,[x19]
00ac9ad0	ldr x9,[x8, #0xb0]
00ac9ad4	cbz x9,0x00ac9af8
00ac9ad8	ldr x0,[x19, #0x8]
00ac9adc	mov x1,x20
00ac9ae0	blr x9
00ac9ae4	ldr x8,[x19]
00ac9ae8	mov w20,w0
00ac9aec	ldr x8,[x8, #0x80]
00ac9af0	cbnz x8,0x00ac9b04
00ac9af4	b 0x00ac9b14
00ac9af8	mov w20,#0x1
00ac9afc	ldr x8,[x8, #0x80]
00ac9b00	cbz x8,0x00ac9b14
00ac9b04	ldr x0,[x19, #0x8]
00ac9b08	blr x8
00ac9b0c	b 0x00ac9b14
00ac9b10	mov w20,wzr
00ac9b14	ldp x29,x30,[sp, #0x10]
00ac9b18	mov w0,w20
00ac9b1c	ldp x20,x19,[sp], #0x20
00ac9b20	ret
