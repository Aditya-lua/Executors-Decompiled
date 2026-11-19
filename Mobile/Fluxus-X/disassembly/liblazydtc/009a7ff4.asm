; ssl3_get_cipher @ 009a7ff4
009a7ff4	mov w8,#0xa6
009a7ff8	adrp x10,0xcc4000
009a7ffc	mov w9,#0x50
009a8000	add x10,x10,#0xfc0
009a8004	sub x8,x8,w0, UXTW 
009a8008	madd x8,x8,x9,x10
009a800c	cmp w0,#0xa7
009a8010	csel x0,x8,xzr,cc
009a8014	ret
