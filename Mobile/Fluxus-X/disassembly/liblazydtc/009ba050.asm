; SSL_CONF_cmd_argv @ 009ba050
009ba050	stp x20,x19,[sp, #-0x20]!
009ba054	mov x20,x2
009ba058	mov x19,x1
009ba05c	stp x29,x30,[sp, #0x10]
009ba060	add x29,sp,#0x10
009ba064	cbz x1,0x009ba07c
009ba068	ldr w8,[x19]
009ba06c	mov w9,wzr
009ba070	cmp w8,#0x1
009ba074	b.ge 0x009ba080
009ba078	b 0x009ba0f4
009ba07c	mov w9,#0x1
009ba080	ldr x8,[x20]
009ba084	ldr x1,[x8]
009ba088	cbz x1,0x009ba0f4
009ba08c	tbnz w9,#0x0,0x009ba0a0
009ba090	ldr w9,[x19]
009ba094	mov x2,xzr
009ba098	cmp w9,#0x1
009ba09c	b.le 0x009ba0a4
009ba0a0	ldr x2,[x8, #0x8]
009ba0a4	ldr w8,[x0]
009ba0a8	and w8,w8,#0xfffffffc
009ba0ac	orr w8,w8,#0x1
009ba0b0	str w8,[x0]
009ba0b4	bl 0x009b9c88
009ba0b8	cmp w0,#0x1
009ba0bc	b.lt 0x009ba0e0
009ba0c0	ldr x8,[x20]
009ba0c4	add x8,x8,w0, SXTW  #0x3
009ba0c8	str x8,[x20]
009ba0cc	cbz x19,0x009ba0f8
009ba0d0	ldr w8,[x19]
009ba0d4	sub w8,w8,w0
009ba0d8	str w8,[x19]
009ba0dc	b 0x009ba0f8
009ba0e0	cmn w0,#0x2
009ba0e4	b.eq 0x009ba0f4
009ba0e8	cbnz w0,0x009ba0f8
009ba0ec	mov w0,#0xffffffff
009ba0f0	b 0x009ba0f8
009ba0f4	mov w0,wzr
009ba0f8	ldp x29,x30,[sp, #0x10]
009ba0fc	ldp x20,x19,[sp], #0x20
009ba100	ret
