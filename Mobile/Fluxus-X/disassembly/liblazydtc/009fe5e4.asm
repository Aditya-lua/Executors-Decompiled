; BIO_vsnprintf @ 009fe5e4
009fe5e4	sub sp,sp,#0x50
009fe5e8	stp x29,x30,[sp, #0x40]
009fe5ec	add x29,sp,#0x40
009fe5f0	stp x1,x0,[x29, #-0x10]
009fe5f4	ldr q0,[x3, #0x10]
009fe5f8	mov x5,x2
009fe5fc	sub x0,x29,#0x8
009fe600	sub x2,x29,#0x10
009fe604	str q0,[sp, #0x10]
009fe608	ldr q0,[x3]
009fe60c	sub x3,x29,#0x18
009fe610	sub x4,x29,#0x1c
009fe614	mov x6,sp
009fe618	mov x1,xzr
009fe61c	str q0,[sp]
009fe620	bl 0x009fda6c
009fe624	mov w8,w0
009fe628	mov w0,#0xffffffff
009fe62c	cbz w8,0x009fe648
009fe630	ldur w8,[x29, #-0x1c]
009fe634	cbnz w8,0x009fe648
009fe638	ldur x8,[x29, #-0x18]
009fe63c	lsr x9,x8,#0x1f
009fe640	cmp x9,#0x0
009fe644	csinv w0,w8,wzr,eq
009fe648	ldp x29,x30,[sp, #0x40]
009fe64c	add sp,sp,#0x50
009fe650	ret
