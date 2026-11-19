; mbedtls_mpi_div_int @ 00b80344
00b80344	sub sp,sp,#0x40
00b80348	str x19,[sp, #0x20]
00b8034c	stp x29,x30,[sp, #0x30]
00b80350	add x29,sp,#0x30
00b80354	mrs x19,tpidr_el0
00b80358	ldr x8,[x19, #0x28]
00b8035c	cmp x3,#0x0
00b80360	asr x9,x3,#0x3f
00b80364	cneg x10,x3,mi
00b80368	str x8,[sp, #0x18]
00b8036c	mov w8,#0x1
00b80370	str x10,[sp, #0x10]
00b80374	add x10,sp,#0x10
00b80378	orr w9,w9,#0x1
00b8037c	mov x3,sp
00b80380	strh w9,[sp, #0x8]
00b80384	strh w8,[sp, #0xa]
00b80388	str x10,[sp]
00b8038c	bl 0x00c41b70
00b80390	ldr x8,[x19, #0x28]
00b80394	ldr x9,[sp, #0x18]
00b80398	cmp x8,x9
00b8039c	b.ne 0x00b803b0
00b803a0	ldp x29,x30,[sp, #0x30]
00b803a4	ldr x19,[sp, #0x20]
00b803a8	add sp,sp,#0x40
00b803ac	ret
00b803b0	bl 0x00c2fec0
