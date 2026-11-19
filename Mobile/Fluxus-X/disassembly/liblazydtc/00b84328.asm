; mbedtls_mpi_core_montmul_init @ 00b84328
00b84328	ldr x8,[x0]
00b8432c	mov w10,#0x2
00b84330	lsl w9,w8,#0x1
00b84334	add w9,w9,#0x4
00b84338	and x9,x9,#0x8
00b8433c	add x9,x9,x8
00b84340	msub x11,x9,x8,x10
00b84344	mul x9,x11,x9
00b84348	msub x11,x9,x8,x10
00b8434c	mul x9,x11,x9
00b84350	msub x11,x9,x8,x10
00b84354	mul x9,x11,x9
00b84358	msub x8,x9,x8,x10
00b8435c	mneg x0,x8,x9
00b84360	ret
