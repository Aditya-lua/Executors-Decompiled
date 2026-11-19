; mbedtls_mpi_core_bigendian_to_host @ 00b83628
00b83628	cbz x1,0x00b83664
00b8362c	cmp x1,#0x1
00b83630	b.mi 0x00b83664
00b83634	add x8,x0,x1, LSL #0x3
00b83638	sub x8,x8,#0x10
00b8363c	ldr x10,[x8, #0x8]
00b83640	ldr x9,[x0]
00b83644	rev x10,x10
00b83648	rev x9,x9
00b8364c	str x10,[x0], #0x8
00b83650	sub x10,x8,#0x8
00b83654	cmp x0,x8
00b83658	str x9,[x8, #0x8]
00b8365c	mov x8,x10
00b83660	b.ls 0x00b8363c
00b83664	ret
