; FUN_009abcb4 @ 009abcb4
009abcb4	stp x29,x30,[sp, #-0x10]!
009abcb8	adrp x2,0x2c3000
009abcbc	add x2,x2,#0x465
009abcc0	mov w0,#0x5
009abcc4	mov x1,xzr
009abcc8	mov x3,xzr
009abccc	mov x4,xzr
009abcd0	mov x5,xzr
009abcd4	mov x29,sp
009abcd8	bl 0x00c34d70
009abcdc	adrp x8,0xcc8000
009abce0	str w0,[x8, #0x490]
009abce4	ldr w8,[x8, #0x490]
009abce8	adrp x9,0xd21000
009abcec	lsr w8,w8,#0x1f
009abcf0	eor w8,w8,#0x1
009abcf4	str w8,[x9, #0x8b4]
009abcf8	ldp x29,x30,[sp], #0x10
009abcfc	ret
