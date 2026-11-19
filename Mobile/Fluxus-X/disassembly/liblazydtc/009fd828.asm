; bread_conv @ 009fd828
009fd828	str x19,[sp, #-0x20]!
009fd82c	stp x29,x30,[sp, #0x10]
009fd830	ldr x8,[x0, #0x8]
009fd834	orr w9,wzr,#0x7fffffff
009fd838	cmp x2,x9
009fd83c	csel w2,w2,w9,cc
009fd840	ldr x8,[x8, #0x28]
009fd844	add x29,sp,#0x10
009fd848	mov x19,x3
009fd84c	blr x8
009fd850	sxtw x8,w0
009fd854	cmp w0,#0x1
009fd858	csel x8,xzr,x8,lt
009fd85c	str x8,[x19]
009fd860	ldp x29,x30,[sp, #0x10]
009fd864	csinc w0,w0,wzr,lt
009fd868	ldr x19,[sp], #0x20
009fd86c	ret
