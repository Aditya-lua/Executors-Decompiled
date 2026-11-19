; tls_close_construct_packet @ 009e293c
009e293c	sub sp,sp,#0x30
009e2940	stp x20,x19,[sp, #0x10]
009e2944	mov x20,x1
009e2948	cmp w2,#0x101
009e294c	mov x19,x0
009e2950	stp x29,x30,[sp, #0x20]
009e2954	add x29,sp,#0x20
009e2958	b.eq 0x009e2968
009e295c	mov x0,x20
009e2960	bl 0x00c34350
009e2964	cbz w0,0x009e2994
009e2968	add x1,sp,#0x8
009e296c	mov x0,x20
009e2970	bl 0x00c36c60
009e2974	cbz w0,0x009e2994
009e2978	ldr x8,[sp, #0x8]
009e297c	mov w0,wzr
009e2980	lsr x9,x8,#0x1f
009e2984	cbnz x9,0x009e2994
009e2988	sxtw x8,w8
009e298c	mov w0,#0x1
009e2990	stp x8,xzr,[x19, #0x98]
009e2994	ldp x29,x30,[sp, #0x20]
009e2998	ldp x20,x19,[sp, #0x10]
009e299c	add sp,sp,#0x30
009e29a0	ret
