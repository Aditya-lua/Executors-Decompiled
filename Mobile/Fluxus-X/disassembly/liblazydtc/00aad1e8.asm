; OBJ_NAME_init @ 00aad1e8
00aad1e8	stp x29,x30,[sp, #-0x10]!
00aad1ec	adrp x0,0xd22000
00aad1f0	adrp x1,0xaad000
00aad1f4	add x0,x0,#0x160
00aad1f8	add x1,x1,#0x21c
00aad1fc	mov x29,sp
00aad200	bl 0x00c34d60
00aad204	adrp x8,0xd22000
00aad208	ldr w8,[x8, #0x164]
00aad20c	cmp w0,#0x0
00aad210	csel w0,wzr,w8,eq
00aad214	ldp x29,x30,[sp], #0x10
00aad218	ret
