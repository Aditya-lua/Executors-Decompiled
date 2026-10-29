/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2f420..0xb2fa94 (1652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2f420_0 {
    char padding_0[8];
    char field_8;
    char padding_9[39];
    struct st_b2f420_1 *field_30;
    unsigned long long field_38;
} st_b2f420_0;

typedef struct st_b2f420_1 {
    char field_0;
} st_b2f420_1;

extern unsigned int _start;
extern char g_10002b0;

unsigned long long sub_b2f420(st_b2f420_0 *a0, void* a1, unsigned int a2, long long a3)
{
    unsigned long long v8;  // x0
    unsigned int v9;  // x0
    unsigned long long v18;  // x19
    unsigned long long v19;  // x0
    long long v20;  // x1
    unsigned long long v21;  // x2
    unsigned long long v22;  // x8
    unsigned long long v23;  // x10
    unsigned long long v24;  // x8
    unsigned long long v25;  // x4
    unsigned int i;  // x11
    unsigned long long v27;  // 4127
    long long v10;  // x23
    unsigned int v28;  // w10
    unsigned int v29;  // x13
    unsigned int v30;  // w12
    unsigned int v31;  // w11
    unsigned int v32;  // w14
    unsigned int v33;  // w12
    unsigned int v34;  // w8
    unsigned long long v35;  // 4113
    unsigned int v36;  // w10
    long long v11;  // x0
    unsigned int v38;  // x27
    unsigned long v39;  // x26
    unsigned long v40;  // x8
    unsigned long long v41;  // x28
    char *v42;  // x28
    unsigned int v44;  // w8
    unsigned int v45;  // w9
    void* v46;  // x21
    void* v47;  // x21
    unsigned int v12;  // x25
    char v48;  // x10
    char v49;  // x9
    char v50;  // x9
    char v51;  // x9
    char v52;  // x9
    unsigned short v53;  // x8
    void* v54;  // x22
    void* v55;  // x22
    char v56;  // x9
    char v57;  // x8
    unsigned int v13;  // x22
    char v58;  // x8
    char v59;  // x8
    char v60;  // x8
    char v61;  // x8
    char v62;  // x8
    char v63;  // x8
    char v64;  // x8
    char v65;  // x8
    char v66;  // x8
    char *v14;  // x27
    unsigned long long n;  // x28
    unsigned int v16;  // w0
    long long v17;  // x1
    unsigned int v0;  // [bp-0xbc]
    char *v1;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned int v2;  // [bp-0xac]
    char v3;  // [bp-0xa8]
    char v4;  // [bp-0x88]
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = sub_a2f9e0();
    if ((unsigned int)v8)
    {
        v8 = sub_b2faa0(a0, a3);
        if ((unsigned int)v8)
        {
            v9 = sub_954340(&a0->field_8);
            if (!v9)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/krb5kdf.c", 137, "krb5kdf_derive");
                v17 = 155;
            }
            else if (!*(long long *)&a0->padding_9[23])
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/krb5kdf.c", 141, "krb5kdf_derive");
                v17 = 128;
            }
            else if (a0->field_30)
            {
                v10 = v9;
                v11 = sub_c4ba8(&a0->field_8);
                v12 = *(long long *)&a0->padding_9[23];
                v13 = *(long long *)&a0->padding_9[31];
                v14 = a0->field_30;
                n = a0->field_38;
                if (v13 == a2 || !(v16 = sub_9f2ae0(v10), a2 != 21 || v13 != 24 || sub_9f2ae0(v10) != 44))
                {
                    v8 = sub_a4bc70();
                    if (v8)
                    {
                        v18 = v8;
                        if (sub_a4d02c() && (v13 == sub_a50904(v18) || (int)sub_a4d408(v18, v13) >= 1) && sub_a4d02c(v18, 0, 0, v12, 0) && sub_a4dbd4(v18, 0))
                        {
                            v19 = sub_a50638(v18);
                            if (!(unsigned int)v19)
                            {
                                sub_a368c8();
                                sub_a369bc("providers/implementations/kdfs/krb5kdf.c", 421, "KRB5KDF");
                                v20 = 155;
                                goto LABEL_b2f688;
                            }
                            if (n > (int)v19)
                            {
                                sub_a368c8();
                                sub_a369bc("providers/implementations/kdfs/krb5kdf.c", 427, "KRB5KDF");
                                v20 = 157;
                                goto LABEL_b2f688;
                            }
                            v21 = v19 & 0xffffffff;
                            v0 = v19;
                            if (n == v21)
                            {
                                ___memcpy_chk(&v3, v14, n, 64);
                            }
                            else
                            {
                                v22 = v21;
                                if ((unsigned int)n)
                                {
                                    v23 = n;
                                    do
                                    {
                                        v24 = v23;
                                        v23 = (unsigned int)v19 - (unsigned int)v24 * (unsigned int)(v19 / v23);
                                        v19 = v24;
                                    } while ((unsigned int)v23);
                                    v22 = v24 & 0xffffffff;
                                }
                                v1 = v21 * n / v22;
                                ___memset_chk(&v3, 0);
                                v25 = v0;
                                i = (unsigned int)v1 - 1;
                                v27 = arm64g_calculate_condition(67, v1 & 0xffffffff, 1, 0);
                                if (!(v27 & 1))
                                {
                                    v28 = 0;
                                    do
                                    {
                                        v29 = i;
                                        v30 = 13 * (unsigned int)(v29 / n);
                                        v31 = v29 - (unsigned int)v25 * (unsigned int)(v29 / v25);
                                        v32 = v29 - (v30 >> 3);
                                        v33 = v28 + (&v3)[v31] + (*(&v14[v29 + -1 * (v30 >> 3) + -1 * n * (v32 - 1) / n] - 1) << ((char)(8 - (v30 & 7)) & 31) & 254 | v14[v29 + -1 * n * (v29 - (v30 >> 3)) / n + -1 * (v30 >> 3)] >> ((char)v30 & 7 & 31));
                                        (&v3)[v31] = v33;
                                        i = v29 - 1;
                                        v28 = v33 >> 8;
                                    } while (i != &_start);
                                    v34 = (unsigned int)v25 - 1;
                                    v35 = arm64g_calculate_condition(67, v25 & 0xffffffff, 1, 0);
                                    if (!(v35 & 1) && v33 >= 0x100)
                                    {
                                        do
                                        {
                                            v36 = (&v3)[v34] + 1;
                                            (&v3)[v34] = v36;
                                        } while (v34 >= 1 && (v34 -= 1, v36 >> 8 & 1));
                                    }
                                }
                            }
                            if (a2)
                            {
                                v1 = &v4;
                                if (sub_c672c8(v18, &v4, &v2, &v3))
                                {
                                    v38 = 0;
                                    while (1)
                                    {
                                        v39 = v2;
                                        if (!sub_a4ca24(v18, v1, &v2))
                                            break;
                                        if (!v2)
                                        {
                                            v40 = a2 - v38;
                                            if (v40 < v39)
                                                v41 = v40;
                                            else
                                                v41 = v39;
                                            _memcpy();
                                            v38 += v41;
                                            if (a2 <= v38)
                                                goto LABEL_b2f92c;
                                            if (!sub_a4bab0(v18) || !sub_a4d02c(v18, v10, v11, 0, 0) || v13 != sub_a50904(v18) && (int)sub_a4d408(v18, v13) < 1 || !sub_a4d02c(v18, 0, 0, v12, 0) || !sub_a4dbd4(v18, 0))
                                                break;
                                            if (v1 == &v3)
                                                v42 = v1 + 32;
                                            else
                                                v42 = &v3;
                                            v1 = v42;
                                            if (!sub_c672c8())
                                                break;
                                        }
                                        else
                                        {
                                            sub_a368c8();
                                            sub_a369bc("providers/implementations/kdfs/krb5kdf.c", 448, "KRB5KDF");
                                            v20 = 107;
LABEL_b2f688:
                                            sub_a36abc(57, v20, 0);
                                            break;
                                        }
                                    }
                                }
                                goto LABEL_b2f690;
                            }
                            else
                            {
LABEL_b2f92c:
                                v8 = 1;
                                if (v13 == a2 && sub_9f2ae0() == 44)
                                {
                                    v44 = (short)a1[18];
                                    v45 = (int)a1[14];
                                    v46 = a1;
                                    *(unsigned int *)&v46[16] = v45;
                                    v47 = v46 + 16;
                                    v48 = (char)a1[20];
                                    *(unsigned short *)&a1[20] = v44;
                                    *(char *)&a1[22] = v48;
                                    v49 = (char)(__ROL__(v45, 1)) & 2 & 3 & 248 | ((char)(__ROL__(v45, 1)) & 2 & 3 & 251 | (char)(__ROL__((char)a1[0x11], 2)) & 4) & 7;
                                    v50 = v49 & 240 | (v49 & 247 | (char)(__ROL__((char)a1[18], 3)) & 8) & 15;
                                    v51 = v50 & 224 | (v50 & 239 | (char)(__ROL__((char)a1[19], 4)) & 16) & 31;
                                    v52 = v51 & 192 | (v51 & 223 | (char)(__ROL__(v44, 5)) & 32) & 63;
                                    *(char *)&a1[23] = v52 & 128 | (v52 & 191 | (char)(__ROL__(__ROL__(v44, 24) & 0xff0000ff & 0xff, 6)) & 64) & 127 | v48 * 128;
                                    sub_9fc200(v47);
                                    v53 = (short)a1[11];
                                    v54 = a1;
                                    *(int *)&v54[8] = (int)a1[7];
                                    v55 = v54 + 8;
                                    v56 = (char)a1[13];
                                    *(unsigned short *)&a1[12] = v53;
                                    *(char *)&a1[14] = v56;
                                    v57 = (char)(__ROL__(*(char *)v55, 1)) & 2 & 3;
                                    v58 = v57 & 248 | (v57 & 251 | (char)(__ROL__((char)a1[9], 2)) & 4) & 7;
                                    v59 = v58 & 240 | (v58 & 247 | (char)(__ROL__((char)a1[10], 3)) & 8) & 15;
                                    v60 = v59 & 224 | (v59 & 239 | (char)(__ROL__((char)a1[11], 4)) & 16) & 31;
                                    v61 = v60 & 192 | (v60 & 223 | (char)(__ROL__((char)a1[12], 5)) & 32) & 63;
                                    *(char *)&a1[15] = v61 & 128 | (v61 & 191 | (char)(__ROL__((char)a1[13], 6)) & 64) & 127 | v56 * 128;
                                    sub_9fc200(v55);
                                    v62 = (char)(__ROL__(*(char *)a1, 1)) & 2 & 3;
                                    v63 = v62 & 248 | (v62 & 251 | (char)(__ROL__((char)a1[1], 2)) & 4) & 7;
                                    v64 = v63 & 240 | (v63 & 247 | (char)(__ROL__((char)a1[2], 3)) & 8) & 15;
                                    v65 = v64 & 224 | (v64 & 239 | (char)(__ROL__((char)a1[3], 4)) & 16) & 31;
                                    v66 = v65 & 192 | (v65 & 223 | (char)(__ROL__((char)a1[4], 5)) & 32) & 63;
                                    *(char *)&a1[7] = v66 & 128 | (v66 & 191 | (char)(__ROL__((char)a1[5], 6)) & 64) & 127 | (char)a1[6] * 128;
                                    sub_9fc200(a1);
                                    if (sub_a66f20(a1, v55, 8) && sub_a66f20(v55, v47, 8))
                                    {
                                        v8 = 1;
                                        goto LABEL_b2f694;
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        sub_a369bc("providers/implementations/kdfs/krb5kdf.c", 482, "KRB5KDF");
                                        v20 = 121;
                                        goto LABEL_b2f688;
                                    }
                                    goto LABEL_b2f688;
                                }
                            }
                        }
                        else
                        {
LABEL_b2f690:
                            v8 = 0;
                        }
LABEL_b2f694:
                        sub_a4bca0(v18);
                        sub_a66ec0(&v3, 64);
                        if (*(long long *)&g_10002b0 == v5)
                            return v8;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v5)
                            return v8;
                        ___stack_chk_fail();
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kdfs/krb5kdf.c", 402, "KRB5KDF");
                    v17 = 139;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/krb5kdf.c", 145, "krb5kdf_derive");
                v17 = 156;
            }
            sub_a36abc(57, v17, 0);
            v8 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v5)
        return v8;
    ___stack_chk_fail();
}
