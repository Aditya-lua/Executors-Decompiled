; BIO_get_new_index @ 009fd5e4
009fd5e4	stp x29,x30,[sp, #-0x10]!
009fd5e8	adrp x0,0xd21000
009fd5ec	adrp x1,0x9fd000
009fd5f0	add x0,x0,#0x8f8
009fd5f4	add x1,x1,#0x66c
009fd5f8	mov x29,sp
009fd5fc	bl 0x00c34d60
009fd600	cbz w0,0x009fd630
009fd604	adrp x8,0xd21000
009fd608	ldr w8,[x8, #0x8fc]
009fd60c	cbz w8,0x009fd630
009fd610	adrp x8,0xcc8000
009fd614	add x8,x8,#0x708
009fd618	ldxr w9,[x8]
009fd61c	add w0,w9,#0x1
009fd620	stxr w9,w0,[x8]
009fd624	cbnz w9,0x009fd618
009fd628	ldp x29,x30,[sp], #0x10
009fd62c	ret
009fd630	bl 0x00c342a0
009fd634	adrp x0,0x2d7000
009fd638	adrp x2,0x2b9000
009fd63c	add x0,x0,#0xc0d
009fd640	add x2,x2,#0xb5a
009fd644	orr w1,wzr,#0x1c
009fd648	bl 0x00c342b0
009fd64c	mov w1,#0x100
009fd650	mov w0,#0x20
009fd654	movk w1,#0xc, LSL #16
009fd658	mov x2,xzr
009fd65c	bl 0x00c342c0
009fd660	mov w0,#0xffffffff
009fd664	ldp x29,x30,[sp], #0x10
009fd668	ret
