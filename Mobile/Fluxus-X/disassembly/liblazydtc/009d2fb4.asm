; tls_construct_ctos_alpn @ 009d2fb4
009d2fb4	stp x20,x19,[sp, #-0x20]!
009d2fb8	stp x29,x30,[sp, #0x10]
009d2fbc	ldr x8,[x0, #0xb08]
009d2fc0	add x29,sp,#0x10
009d2fc4	str wzr,[x0, #0x4a8]
009d2fc8	cbz x8,0x009d2fe4
009d2fcc	ldr x8,[x0, #0x240]
009d2fd0	mov x20,x1
009d2fd4	mov x19,x0
009d2fd8	cbz x8,0x009d2fec
009d2fdc	ldr x8,[x19, #0x2c8]
009d2fe0	cbz x8,0x009d2fec
009d2fe4	mov w0,#0x2
009d2fe8	b 0x009d3078
009d2fec	mov w1,#0x10
009d2ff0	mov w2,#0x2
009d2ff4	mov x0,x20
009d2ff8	bl 0x00c343a0
009d2ffc	cbz w0,0x009d3040
009d3000	mov w1,#0x2
009d3004	mov x0,x20
009d3008	bl 0x00c343b0
009d300c	cbz w0,0x009d3040
009d3010	ldr x1,[x19, #0xb08]
009d3014	ldr x2,[x19, #0xb10]
009d3018	mov w3,#0x2
009d301c	mov x0,x20
009d3020	bl 0x00c36f70
009d3024	cbz w0,0x009d3040
009d3028	mov x0,x20
009d302c	bl 0x00c34350
009d3030	cbz w0,0x009d3040
009d3034	mov w0,#0x1
009d3038	str w0,[x19, #0x4a8]
009d303c	b 0x009d3078
009d3040	bl 0x00c342a0
009d3044	adrp x0,0x2bf000
009d3048	adrp x2,0x2db000
009d304c	add x0,x0,#0x967
009d3050	add x2,x2,#0xc0a
009d3054	mov w1,#0x1a5
009d3058	bl 0x00c342b0
009d305c	mov w2,#0x103
009d3060	mov w1,#0x50
009d3064	movk w2,#0xc, LSL #16
009d3068	mov x0,x19
009d306c	mov x3,xzr
009d3070	bl 0x00c34410
009d3074	mov w0,wzr
009d3078	ldp x29,x30,[sp, #0x10]
009d307c	ldp x20,x19,[sp], #0x20
009d3080	ret
