; std::__ndk1::__num_get_base::__get_base @ 00c02764
00c02764	bti c
00c02768	ldr w8,[x0, #0x8]
00c0276c	mov w9,#0x4a
00c02770	ands w8,w8,w9
00c02774	b.eq 0x00c02798
00c02778	cmp w8,#0x40
00c0277c	b.eq 0x00c02790
00c02780	cmp w8,#0x8
00c02784	b.ne 0x00c027a0
00c02788	mov w0,#0x10
00c0278c	ret
00c02790	mov w0,#0x8
00c02794	ret
00c02798	mov w0,wzr
00c0279c	ret
00c027a0	mov w0,#0xa
00c027a4	ret
