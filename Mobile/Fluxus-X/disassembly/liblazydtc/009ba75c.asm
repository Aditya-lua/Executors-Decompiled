; FUN_009ba75c @ 009ba75c
009ba75c	stp x20,x19,[sp, #-0x20]!
009ba760	stp x29,x30,[sp, #0x10]
009ba764	mov x20,x0
009ba768	ldr x0,[x0, #0x18]
009ba76c	mov x19,x1
009ba770	add x29,sp,#0x10
009ba774	cbz x0,0x009ba7a8
009ba778	mov x1,x19
009ba77c	bl 0x00c32780
009ba780	ldr x8,[x20, #0x20]
009ba784	cbz x8,0x009ba794
009ba788	mov x0,x8
009ba78c	mov x1,x19
009ba790	bl 0x00c35390
009ba794	ldp x29,x30,[sp, #0x10]
009ba798	cmp w0,#0x0
009ba79c	cset w0,gt
009ba7a0	ldp x20,x19,[sp], #0x20
009ba7a4	ret
009ba7a8	mov w0,#0x1
009ba7ac	ldr x8,[x20, #0x20]
009ba7b0	cbnz x8,0x009ba788
009ba7b4	b 0x009ba794
