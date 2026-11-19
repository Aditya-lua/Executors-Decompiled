; BIO_ADDR_make @ 009fac1c
009fac1c	ldrh w8,[x1]
009fac20	cmp w8,#0x1
009fac24	b.eq 0x009fac44
009fac28	cmp w8,#0xa
009fac2c	b.eq 0x009fac64
009fac30	cmp w8,#0x2
009fac34	mov w8,wzr
009fac38	b.eq 0x009fac6c
009fac3c	mov w0,w8
009fac40	ret
009fac44	stp x29,x30,[sp, #-0x10]!
009fac48	mov w2,#0x6e
009fac4c	mov x29,sp
009fac50	bl 0x00c2ffd0
009fac54	mov w8,#0x1
009fac58	ldp x29,x30,[sp], #0x10
009fac5c	mov w0,w8
009fac60	ret
009fac64	ldur q0,[x1, #0xc]
009fac68	stur q0,[x0, #0xc]
009fac6c	ldr q0,[x1]
009fac70	mov w8,#0x1
009fac74	str q0,[x0]
009fac78	mov w0,w8
009fac7c	ret
