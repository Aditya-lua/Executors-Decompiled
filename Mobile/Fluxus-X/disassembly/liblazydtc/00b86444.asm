; mbedtls_to_psa_error @ 00b86444
00b86444	neg w8,w0
00b86448	and w9,w8,#0x7f
00b8644c	tst w8,#0x7f
00b86450	csneg w0,w0,w9,eq
00b86454	mov w8,#0xffffc6ff
00b86458	cmp w0,w8
00b8645c	b.gt 0x00b864bc
00b86460	mov w8,#0xffffbbff
00b86464	cmp w0,w8
00b86468	b.le 0x00b864e4
00b8646c	mov w8,#0xffffc17f
00b86470	cmp w0,w8
00b86474	b.le 0x00b86534
00b86478	orr w8,wzr,#0xffffc3ff
00b8647c	cmp w0,w8
00b86480	b.le 0x00b865b8
00b86484	mov w8,#0xffffc57f
00b86488	cmp w0,w8
00b8648c	b.gt 0x00b86694
00b86490	mov w8,#0xffffc400
00b86494	cmp w0,w8
00b86498	b.eq 0x00b866f0
00b8649c	mov w8,#0xffffc480
00b864a0	cmp w0,w8
00b864a4	b.eq 0x00b866f0
00b864a8	mov w8,#0xffffc500
00b864ac	cmp w0,w8
00b864b0	b.ne 0x00b86880
00b864b4	mov w0,#0xffffff79
00b864b8	ret
00b864bc	add w8,w0,#0x72
00b864c0	cmp w8,#0x72
00b864c4	b.hi 0x00b866d0
00b864c8	adrp x9,0x780000
00b864cc	add x9,x9,#0x554
00b864d0	ldrsw x8,[x9, x8, LSL #0x2]
00b864d4	add x8,x8,x9
00b864d8	br x8
00b864dc	mov w0,#0xffffff79
00b864e0	ret
00b864e4	mov w8,#0xffffaf7f
00b864e8	cmp w0,w8
00b864ec	b.gt 0x00b86578
00b864f0	mov w8,#0xffff9eff
00b864f4	cmp w0,w8
00b864f8	b.gt 0x00b865f0
00b864fc	mov w8,#0xffff9d7f
00b86500	cmp w0,w8
00b86504	b.le 0x00b866f8
00b86508	mov w8,#0xffff9d80
00b8650c	cmp w0,w8
00b86510	b.eq 0x00b86830
00b86514	mov w8,#0xffff9e00
00b86518	cmp w0,w8
00b8651c	b.eq 0x00b86838
00b86520	mov w8,#0xffff9e80
00b86524	cmp w0,w8
00b86528	b.ne 0x00b86880
00b8652c	mov w0,#0xffffff73
00b86530	ret
00b86534	mov w8,#0xffffbe7f
00b86538	cmp w0,w8
00b8653c	b.gt 0x00b86628
00b86540	mov w8,#0xffffbcff
00b86544	cmp w0,w8
00b86548	b.le 0x00b86718
00b8654c	mov w8,#0xffffbd00
00b86550	cmp w0,w8
00b86554	b.eq 0x00b86738
00b86558	mov w8,#0xffffbd80
00b8655c	cmp w0,w8
00b86560	b.eq 0x00b86738
00b86564	mov w8,#0xffffbe00
00b86568	cmp w0,w8
00b8656c	b.ne 0x00b86880
00b86570	mov w0,#0xffffff79
00b86574	ret
00b86578	mov w8,#0xffffb27f
00b8657c	cmp w0,w8
00b86580	b.gt 0x00b8665c
00b86584	mov w8,#0xffffb0ff
00b86588	cmp w0,w8
00b8658c	b.le 0x00b86740
00b86590	mov w8,#0xffffb100
00b86594	cmp w0,w8
00b86598	b.eq 0x00b86800
00b8659c	mov w8,#0xffffb180
00b865a0	cmp w0,w8
00b865a4	b.eq 0x00b86840
00b865a8	mov w8,#0xffffb200
00b865ac	cmp w0,w8
00b865b0	b.eq 0x00b867f8
00b865b4	b 0x00b86880
00b865b8	mov w8,#0xffffc27f
00b865bc	cmp w0,w8
00b865c0	b.le 0x00b86760
00b865c4	mov w8,#0xffffc280
00b865c8	cmp w0,w8
00b865cc	b.eq 0x00b86780
00b865d0	mov w8,#0xffffc300
00b865d4	cmp w0,w8
00b865d8	b.eq 0x00b86780
00b865dc	mov w8,#0xffffc380
00b865e0	cmp w0,w8
00b865e4	b.ne 0x00b86880
00b865e8	mov w0,#0xffffff7a
00b865ec	ret
00b865f0	mov w8,#0xffffadff
00b865f4	cmp w0,w8
00b865f8	b.le 0x00b86788
00b865fc	mov w8,#0xffffae00
00b86600	cmp w0,w8
00b86604	b.eq 0x00b867a8
00b86608	mov w8,#0xffffae80
00b8660c	cmp w0,w8
00b86610	b.eq 0x00b86848
00b86614	mov w8,#0xffffaf00
00b86618	cmp w0,w8
00b8661c	b.ne 0x00b86880
00b86620	mov w0,#0xffffff79
00b86624	ret
00b86628	mov w8,#0xffffbf7f
00b8662c	cmp w0,w8
00b86630	b.le 0x00b867b0
00b86634	mov w8,#0xffffbf80
00b86638	cmp w0,w8
00b8663c	b.eq 0x00b86850
00b86640	mov w8,#0xffffc080
00b86644	cmp w0,w8
00b86648	b.eq 0x00b867d0
00b8664c	mov w8,#0xffffc100
00b86650	cmp w0,w8
00b86654	b.eq 0x00b86808
00b86658	b 0x00b86880
00b8665c	mov w8,#0xffffb37f
00b86660	cmp w0,w8
00b86664	b.le 0x00b867d8
00b86668	mov w8,#0xffffb380
00b8666c	cmp w0,w8
00b86670	b.eq 0x00b86758
00b86674	mov w8,#0xffffb400
00b86678	cmp w0,w8
00b8667c	b.eq 0x00b867f8
00b86680	mov w8,#0xffffbb80
00b86684	cmp w0,w8
00b86688	b.ne 0x00b86880
00b8668c	mov w0,#0xffffff6c
00b86690	ret
00b86694	mov w8,#0xffffc580
00b86698	cmp w0,w8
00b8669c	b.eq 0x00b866b8
00b866a0	mov w8,#0xffffc600
00b866a4	cmp w0,w8
00b866a8	b.eq 0x00b866b8
00b866ac	mov w8,#0xffffc680
00b866b0	cmp w0,w8
00b866b4	b.ne 0x00b86880
00b866b8	mov w0,#0xffffff7a
00b866bc	ret
00b866c0	mov w0,#0xffffff6c
00b866c4	ret
00b866c8	mov w0,#0xffffff79
00b866cc	ret
00b866d0	mov w8,#0xffffc700
00b866d4	cmp w0,w8
00b866d8	b.eq 0x00b86910
00b866dc	mov w8,#0xffffc780
00b866e0	cmp w0,w8
00b866e4	b.ne 0x00b86880
00b866e8	mov w0,#0xffffff76
00b866ec	ret
00b866f0	mov w0,#0xffffff7b
00b866f4	ret
00b866f8	mov w8,#0xffff9c80
00b866fc	cmp w0,w8
00b86700	b.eq 0x00b86858
00b86704	mov w8,#0xffff9d00
00b86708	cmp w0,w8
00b8670c	b.ne 0x00b86880
00b86710	mov w0,#0xffffff6b
00b86714	ret
00b86718	mov w8,#0xffffbc00
00b8671c	cmp w0,w8
00b86720	b.eq 0x00b86800
00b86724	mov w8,#0xffffbc80
00b86728	cmp w0,w8
00b8672c	b.ne 0x00b86880
00b86730	mov w0,#0xffffff6b
00b86734	ret
00b86738	mov w0,#0xffffff69
00b8673c	ret
00b86740	mov w8,#0xffffaf80
00b86744	cmp w0,w8
00b86748	b.eq 0x00b86860
00b8674c	mov w8,#0xffffb080
00b86750	cmp w0,w8
00b86754	b.ne 0x00b86880
00b86758	mov w0,#0xffffff79
00b8675c	ret
00b86760	mov w8,#0xffffc180
00b86764	cmp w0,w8
00b86768	b.eq 0x00b86808
00b8676c	mov w8,#0xffffc200
00b86770	cmp w0,w8
00b86774	b.ne 0x00b86880
00b86778	mov w0,#0xffffff6e
00b8677c	ret
00b86780	mov w0,#0xffffff79
00b86784	ret
00b86788	mov w8,#0xffff9f00
00b8678c	cmp w0,w8
00b86790	b.eq 0x00b86868
00b86794	mov w8,#0xffff9f80
00b86798	cmp w0,w8
00b8679c	b.ne 0x00b86880
00b867a0	mov w0,#0xffffff7a
00b867a4	ret
00b867a8	mov w0,#0xffffff6e
00b867ac	ret
00b867b0	mov w8,#0xffffbe80
00b867b4	cmp w0,w8
00b867b8	b.eq 0x00b86870
00b867bc	mov w8,#0xffffbf00
00b867c0	cmp w0,w8
00b867c4	b.ne 0x00b86880
00b867c8	mov w0,#0xffffff6a
00b867cc	ret
00b867d0	mov w0,#0xffffff73
00b867d4	ret
00b867d8	mov w8,#0xffffb280
00b867dc	cmp w0,w8
00b867e0	b.eq 0x00b86878
00b867e4	mov w8,#0xffffb300
00b867e8	cmp w0,w8
00b867ec	b.ne 0x00b86880
00b867f0	mov w0,#0xffffff6c
00b867f4	ret
00b867f8	mov w0,#0xffffff6b
00b867fc	ret
00b86800	mov w0,#0xffffff76
00b86804	ret
00b86808	mov w0,#0xffffff79
00b8680c	ret
00b86810	mov w0,#0xffffff7a
00b86814	ret
00b86818	mov w0,#0xffffff7a
00b8681c	ret
00b86820	mov w0,#0xffffff7a
00b86824	ret
00b86828	mov w0,#0xffffff79
00b8682c	ret
00b86830	mov w0,#0xffffff79
00b86834	ret
00b86838	mov w0,#0xffffff6a
00b8683c	ret
00b86840	mov w0,#0xffffff7a
00b86844	ret
00b86848	mov w0,#0xffffff73
00b8684c	ret
00b86850	mov w0,#0xffffff79
00b86854	ret
00b86858	mov w0,#0xffffff69
00b8685c	ret
00b86860	mov w0,#0xffffff7a
00b86864	ret
00b86868	mov w0,#0xffffff79
00b8686c	ret
00b86870	mov w0,#0xffffff6d
00b86874	ret
00b86878	mov w0,#0xffffff73
00b8687c	ret
00b86880	mov w0,#0xffffff7c
00b86884	ret
00b86888	mov w0,#0xffffff7a
00b8688c	ret
00b86890	mov w0,#0xffffff6d
00b86894	ret
00b86898	mov w0,#0xffffff69
00b8689c	ret
00b868a0	mov w0,#0xffffff76
00b868a4	ret
00b868a8	mov w0,#0xffffff73
00b868ac	ret
00b868b0	mov w0,#0xffffff6b
00b868b4	ret
00b868b8	mov w0,#0xffffff77
00b868bc	ret
00b868c0	mov w0,#0xffffff79
00b868c4	ret
00b868c8	mov w0,#0xffffff6c
00b868cc	ret
00b868d0	mov w0,#0xffffff6c
00b868d4	ret
00b868d8	mov w0,#0xffffff7a
00b868dc	ret
00b868e0	mov w0,#0xffffff76
00b868e4	ret
00b868e8	mov w0,#0xffffff79
00b868ec	ret
00b868f0	mov w0,#0xffffff6b
00b868f4	ret
00b868f8	mov w0,#0xffffff6b
00b868fc	ret
00b86900	mov w0,#0xffffff79
00b86904	ret
00b86908	mov w0,#0xffffff76
00b8690c	ret
00b86910	mov w0,#0xffffff6b
00b86914	ret
