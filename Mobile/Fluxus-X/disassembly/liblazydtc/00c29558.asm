; __cxa_throw @ 00c29558
00c29558	paciasp
00c2955c	stp x29,x30,[sp, #-0x30]!
00c29560	str x21,[sp, #0x10]
00c29564	stp x20,x19,[sp, #0x20]
00c29568	mov x29,sp
00c2956c	mov x19,x2
00c29570	mov x20,x1
00c29574	mov x21,x0
00c29578	bl 0x00c44720
00c2957c	ldr w8,[x0, #0x8]
00c29580	mov x1,x20
00c29584	mov x2,x19
00c29588	add w8,w8,#0x1
00c2958c	str w8,[x0, #0x8]
00c29590	mov x0,x21
00c29594	bl 0x00c43ec0
00c29598	mov w8,#0x1
00c2959c	mov x19,x0
00c295a0	str x8,[x0, #0x8]
00c295a4	add x0,x0,#0x60
00c295a8	bl 0x00c2bd40
00c295ac	mov x0,x19
00c295b0	bl 0x00c295b4
