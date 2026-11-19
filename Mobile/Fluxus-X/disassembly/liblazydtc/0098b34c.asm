; ix::CaseInsensitiveLess::NocaseCompare::operator() @ 0098b34c
0098b34c	str x19,[sp, #-0x20]!
0098b350	stp x29,x30,[sp, #0x10]
0098b354	add x29,sp,#0x10
0098b358	ldrb w0,[x1]
0098b35c	mov x19,x2
0098b360	bl 0x00c30f10
0098b364	ldrb w8,[x19]
0098b368	mov w19,w0
0098b36c	mov w0,w8
0098b370	bl 0x00c30f10
0098b374	ldp x29,x30,[sp, #0x10]
0098b378	cmp w19,w0
0098b37c	cset w0,lt
0098b380	ldr x19,[sp], #0x20
0098b384	ret
