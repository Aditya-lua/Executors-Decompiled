; BIO_meth_free @ 009fd750
009fd750	cbz x0,0x009fd794
009fd754	stp x20,x19,[sp, #-0x20]!
009fd758	stp x29,x30,[sp, #0x10]
009fd75c	mov x19,x0
009fd760	ldr x0,[x0, #0x8]
009fd764	adrp x20,0x2d7000
009fd768	add x20,x20,#0xc0d
009fd76c	mov w2,#0x35
009fd770	mov x1,x20
009fd774	add x29,sp,#0x10
009fd778	bl 0x00c32310
009fd77c	ldp x29,x30,[sp, #0x10]
009fd780	mov w2,#0x36
009fd784	mov x0,x19
009fd788	mov x1,x20
009fd78c	ldp x20,x19,[sp], #0x20
009fd790	b 0x00c32310
009fd794	ret
