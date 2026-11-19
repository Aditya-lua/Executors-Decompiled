; cpr::ThreadPool::Start @ 008fe028
008fe028	str x21,[sp, #-0x30]!
008fe02c	stp x20,x19,[sp, #0x10]
008fe030	stp x29,x30,[sp, #0x20]
008fe034	add x29,sp,#0x20
008fe038	add x8,x0,#0x20
008fe03c	ldar w9,[x8]
008fe040	mov x19,x0
008fe044	cbz w9,0x008fe050
008fe048	mov w0,#0xffffffff
008fe04c	b 0x008fe08c
008fe050	mov w9,#0x1
008fe054	stlr w9,[x8]
008fe058	ldp x8,x9,[x19, #0x8]
008fe05c	cmp x8,x1
008fe060	csel x8,x8,x1,hi
008fe064	cmp x8,x9
008fe068	csel x20,x9,x8,hi
008fe06c	cbz x20,0x008fe088
008fe070	mov x21,xzr
008fe074	mov x0,x19
008fe078	bl 0x00c31320
008fe07c	add x21,x21,#0x1
008fe080	cmp x21,x20
008fe084	b.cc 0x008fe074
008fe088	mov w0,wzr
008fe08c	ldp x29,x30,[sp, #0x20]
008fe090	ldp x20,x19,[sp, #0x10]
008fe094	ldr x21,[sp], #0x30
008fe098	ret
