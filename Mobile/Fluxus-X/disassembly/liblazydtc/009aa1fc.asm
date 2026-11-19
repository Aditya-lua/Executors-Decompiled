; ssl_gensecret @ 009aa1fc
009aa1fc	str x21,[sp, #-0x30]!
009aa200	stp x20,x19,[sp, #0x10]
009aa204	stp x29,x30,[sp, #0x20]
009aa208	ldr x8,[x0, #0x8]
009aa20c	mov x19,x2
009aa210	mov x20,x0
009aa214	mov x21,x1
009aa218	ldr x9,[x8, #0xc0]
009aa21c	add x29,sp,#0x20
009aa220	ldrb w9,[x9, #0x60]
009aa224	tbnz w9,#0x3,0x009aa294
009aa228	ldr w8,[x8]
009aa22c	cmp w8,#0x304
009aa230	b.lt 0x009aa294
009aa234	cmp w8,#0x10, LSL #12
009aa238	b.eq 0x009aa294
009aa23c	ldr w8,[x20, #0x4d0]
009aa240	cbnz w8,0x009aa26c
009aa244	mov x0,x20
009aa248	bl 0x00c34a10
009aa24c	mov x1,x0
009aa250	add x5,x20,#0x544
009aa254	mov x0,x20
009aa258	mov x2,xzr
009aa25c	mov x3,xzr
009aa260	mov x4,xzr
009aa264	bl 0x00c34ab0
009aa268	cbz w0,0x009aa284
009aa26c	mov x0,x20
009aa270	mov x1,x21
009aa274	mov x2,x19
009aa278	bl 0x00c34aa0
009aa27c	cmp w0,#0x0
009aa280	cset w0,ne
009aa284	ldp x29,x30,[sp, #0x20]
009aa288	ldp x20,x19,[sp, #0x10]
009aa28c	ldr x21,[sp], #0x30
009aa290	ret
009aa294	mov x0,x20
009aa298	mov x2,x19
009aa29c	ldp x29,x30,[sp, #0x20]
009aa2a0	ldp x20,x19,[sp, #0x10]
009aa2a4	mov x1,x21
009aa2a8	mov w3,wzr
009aa2ac	ldr x21,[sp], #0x30
009aa2b0	b 0x009a9d08
