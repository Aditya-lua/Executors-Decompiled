; EVP_set_pw_prompt @ 00ab7ae4
00ab7ae4	cbz x0,0x00ab7b1c
00ab7ae8	str x19,[sp, #-0x20]!
00ab7aec	adrp x19,0xd22000
00ab7af0	add x19,x19,#0x1a0
00ab7af4	mov x1,x0
00ab7af8	mov w2,#0x4f
00ab7afc	mov x0,x19
00ab7b00	stp x29,x30,[sp, #0x10]
00ab7b04	add x29,sp,#0x10
00ab7b08	bl 0x00c30ba0
00ab7b0c	ldp x29,x30,[sp, #0x10]
00ab7b10	strb wzr,[x19, #0x4f]
00ab7b14	ldr x19,[sp], #0x20
00ab7b18	ret
00ab7b1c	adrp x8,0xd22000
00ab7b20	strb wzr,[x8, #0x1a0]
00ab7b24	ret
