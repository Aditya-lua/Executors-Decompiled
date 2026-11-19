; ZSTD_findFrameCompressedSize @ 00bb0340
00bb0340	sub sp,sp,#0x40
00bb0344	stp x29,x30,[sp, #0x20]
00bb0348	str x19,[sp, #0x30]
00bb034c	add x29,sp,#0x20
00bb0350	mrs x19,tpidr_el0
00bb0354	mov w2,wzr
00bb0358	ldr x8,[x19, #0x28]
00bb035c	stur x8,[x29, #-0x8]
00bb0360	mov x8,sp
00bb0364	bl 0x00bb04a4
00bb0368	ldr x0,[sp, #0x8]
00bb036c	ldr x8,[x19, #0x28]
00bb0370	ldur x9,[x29, #-0x8]
00bb0374	cmp x8,x9
00bb0378	b.ne 0x00bb038c
00bb037c	ldp x29,x30,[sp, #0x20]
00bb0380	ldr x19,[sp, #0x30]
00bb0384	add sp,sp,#0x40
00bb0388	ret
00bb038c	bl 0x00c2fec0
