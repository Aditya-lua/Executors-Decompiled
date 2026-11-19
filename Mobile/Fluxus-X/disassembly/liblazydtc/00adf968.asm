; SHA256_Init @ 00adf968
00adf968	str x19,[sp, #-0x20]!
00adf96c	mov x19,x0
00adf970	add x0,x0,#0x20
00adf974	mov w2,#0x4c
00adf978	mov w1,wzr
00adf97c	stp x29,x30,[sp, #0x10]
00adf980	add x29,sp,#0x10
00adf984	bl 0x00c301c0
00adf988	adrp x8,0x29d000
00adf98c	adrp x9,0x29c000
00adf990	ldr q0,[x8, #0x110]
00adf994	ldr q1,[x9, #0xcf0]
00adf998	mov w8,#0x20
00adf99c	str w8,[x19, #0x6c]
00adf9a0	mov w0,#0x1
00adf9a4	stp q0,q1,[x19]
00adf9a8	ldp x29,x30,[sp, #0x10]
00adf9ac	ldr x19,[sp], #0x20
00adf9b0	ret
