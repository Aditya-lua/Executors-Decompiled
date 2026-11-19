; SHA224_Init @ 00adf91c
00adf91c	str x19,[sp, #-0x20]!
00adf920	mov x19,x0
00adf924	add x0,x0,#0x20
00adf928	mov w2,#0x4c
00adf92c	mov w1,wzr
00adf930	stp x29,x30,[sp, #0x10]
00adf934	add x29,sp,#0x10
00adf938	bl 0x00c301c0
00adf93c	adrp x8,0x29d000
00adf940	adrp x9,0x29c000
00adf944	ldr q0,[x8, #0x1f0]
00adf948	ldr q1,[x9, #0xca0]
00adf94c	orr w8,wzr,#0x1c
00adf950	str w8,[x19, #0x6c]
00adf954	mov w0,#0x1
00adf958	stp q0,q1,[x19]
00adf95c	ldp x29,x30,[sp, #0x10]
00adf960	ldr x19,[sp], #0x20
00adf964	ret
