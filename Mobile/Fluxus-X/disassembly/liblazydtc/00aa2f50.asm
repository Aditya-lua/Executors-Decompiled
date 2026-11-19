; FUN_00aa2f50 @ 00aa2f50
00aa2f50	stp x22,x21,[sp, #-0x30]!
00aa2f54	stp x20,x19,[sp, #0x10]
00aa2f58	mov x19,x1
00aa2f5c	adrp x1,0x2aa000
00aa2f60	mov x21,x2
00aa2f64	mov x22,x0
00aa2f68	add x1,x1,#0x4b5
00aa2f6c	orr w0,wzr,#0xe0
00aa2f70	mov w2,#0x1cb
00aa2f74	stp x29,x30,[sp, #0x20]
00aa2f78	add x29,sp,#0x20
00aa2f7c	bl 0x00c34250
00aa2f80	mov x20,x0
00aa2f84	cbz x0,0x00aa3030
00aa2f88	add x8,x20,#0x10
00aa2f8c	mov w9,#0x1
00aa2f90	stlr w9,[x8]
00aa2f94	bl 0x00c34d50
00aa2f98	str x0,[x20, #0xb8]
00aa2f9c	cbz x0,0x00aa2ff0
00aa2fa0	bl 0x00c34d50
00aa2fa4	str x0,[x20, #0x8]
00aa2fa8	cbz x0,0x00aa2ff0
00aa2fac	adrp x1,0x2aa000
00aa2fb0	add x1,x1,#0x4b5
00aa2fb4	mov w2,#0x1d9
00aa2fb8	mov x0,x22
00aa2fbc	bl 0x00c34600
00aa2fc0	str x0,[x20, #0x28]
00aa2fc4	cbz x0,0x00aa2ff0
00aa2fc8	adrp x1,0xaa4000
00aa2fcc	adrp x2,0xaa2000
00aa2fd0	add x1,x1,#0x8fc
00aa2fd4	add x2,x2,#0x7d0
00aa2fd8	mov x0,x21
00aa2fdc	bl 0x00c3ebf0
00aa2fe0	str x0,[x20, #0x48]
00aa2fe4	cbz x0,0x00aa2ff0
00aa2fe8	str x19,[x20, #0x40]
00aa2fec	b 0x00aa3070
00aa2ff0	mov x0,x20
00aa2ff4	bl 0x00aa2c44
00aa2ff8	bl 0x00c342a0
00aa2ffc	adrp x0,0x2aa000
00aa3000	adrp x2,0x2b2000
00aa3004	add x0,x0,#0x4b5
00aa3008	add x2,x2,#0x56e
00aa300c	mov w1,#0x1de
00aa3010	bl 0x00c342b0
00aa3014	mov w1,#0x100
00aa3018	orr w0,wzr,#0xf
00aa301c	movk w1,#0xc, LSL #16
00aa3020	mov x2,xzr
00aa3024	bl 0x00c342c0
00aa3028	mov x20,xzr
00aa302c	b 0x00aa3070
00aa3030	adrp x19,0x2aa000
00aa3034	add x19,x19,#0x4b5
00aa3038	mov w2,#0x1d0
00aa303c	mov x1,x19
00aa3040	bl 0x00c32310
00aa3044	bl 0x00c342a0
00aa3048	adrp x2,0x2b2000
00aa304c	add x2,x2,#0x56e
00aa3050	mov w1,#0x1d1
00aa3054	mov x0,x19
00aa3058	bl 0x00c342b0
00aa305c	mov w1,#0x100
00aa3060	orr w0,wzr,#0xf
00aa3064	movk w1,#0xc, LSL #16
00aa3068	mov x2,xzr
00aa306c	bl 0x00c342c0
00aa3070	mov x0,x20
00aa3074	ldp x29,x30,[sp, #0x20]
00aa3078	ldp x20,x19,[sp, #0x10]
00aa307c	ldp x22,x21,[sp], #0x30
00aa3080	ret
