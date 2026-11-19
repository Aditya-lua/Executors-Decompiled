; std::__ndk1::__vector_base_common<true>::__throw_length_error @ 008e7910
008e7910	stp x20,x19,[sp, #-0x20]!
008e7914	stp x29,x30,[sp, #0x10]
008e7918	add x29,sp,#0x10
008e791c	mov w0,#0x10
008e7920	bl 0x00c30000
008e7924	mov x19,x0
008e7928	adrp x1,0x2ca000
008e792c	add x1,x1,#0xa6b
008e7930	bl 0x00c30040
008e7934	adrp x8,0xcb4000
008e7938	ldr x8,[x8, #0x980]
008e793c	adrp x1,0xcb4000
008e7940	adrp x2,0xcb4000
008e7944	mov x0,x19
008e7948	add x8,x8,#0x10
008e794c	str x8,[x19]
008e7950	ldr x1,[x1, #0x970]
008e7954	ldr x2,[x2, #0x978]
008e7958	bl 0x00c30020
