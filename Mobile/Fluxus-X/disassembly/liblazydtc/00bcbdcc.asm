; std::__ndk1::notify_all_at_thread_exit @ 00bcbdcc
00bcbdcc	paciasp
00bcbdd0	stp x29,x30,[sp, #-0x30]!
00bcbdd4	stp x22,x21,[sp, #0x10]
00bcbdd8	stp x20,x19,[sp, #0x20]
00bcbddc	mov x29,sp
00bcbde0	mov x19,x1
00bcbde4	mov x20,x0
00bcbde8	bl 0x00c30180
00bcbdec	mov x21,x0
00bcbdf0	ldr w0,[x0]
00bcbdf4	bl 0x00c3ece0
00bcbdf8	cbnz x0,0x00bcbe18
00bcbdfc	mov w0,#0x8
00bcbe00	bl 0x00c2fed0
00bcbe04	mov x22,x0
00bcbe08	bl 0x00c2ffa0
00bcbe0c	ldr w0,[x21]
00bcbe10	mov x1,x22
00bcbe14	bl 0x00c30190
00bcbe18	bl 0x00c30180
00bcbe1c	ldr w0,[x0]
00bcbe20	bl 0x00c3ece0
00bcbe24	ldr x2,[x19]
00bcbe28	str xzr,[x19]
00bcbe2c	mov x1,x20
00bcbe30	strb wzr,[x19, #0x8]
00bcbe34	ldp x20,x19,[sp, #0x20]
00bcbe38	ldp x22,x21,[sp, #0x10]
00bcbe3c	ldp x29,x30,[sp], #0x30
00bcbe40	autiasp
00bcbe44	b 0x00c43e40
