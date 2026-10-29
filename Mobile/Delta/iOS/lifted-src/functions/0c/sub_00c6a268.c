/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6a268..0xc6a478 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c6a268(long long *a0, unsigned long long *a1)
{
    unsigned long long v13;  // x28
    unsigned long long v14;  // x27
    unsigned long long v23;  // x30
    unsigned long long v24;  // x23
    unsigned long long v25;  // x20
    unsigned long long v26;  // x21
    unsigned long long idx;  // x24
    unsigned long long index;  // x0
    unsigned long v29;  // x26
    unsigned long v30;  // x25
    unsigned long v31;  // x24
    unsigned long v32;  // x27
    unsigned long long v15;  // x26
    unsigned long long v33;  // x0
    unsigned long long v34;  // w8
    long long v35;  // x1
    unsigned int v36;  // w0
    unsigned long long v37;  // x0
    unsigned long long v16;  // x25
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v0 = v13;
    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = &v12;
    v11 = v23;
    v24 = 0;
    v25 = 0;
    v26 = 0;
    while (1)
    {
        if ((int)(sub_ad69e4(*a0) - 1) > (int)v24)
        {
            idx = sub_ad69f8(*a0, v24);
            index = sub_ad69f8(*a0, (unsigned int)v24 + 1);
            if (!idx)
                goto LABEL_c6a448;
            if (*(int *)idx)
            {
                if (*(int *)idx == 1)
                {
                    v29 = *(long long *)*(long long *)(idx + 8);
                    v30 = *(long long *)(*(long long *)(idx + 8) + 8);
                    goto LABEL_c6a2f0;
                }
                goto LABEL_c6a448;
            }
            v30 = *(long long *)(idx + 8);
            v29 = v30;
LABEL_c6a2f0:
            if (!index)
                goto LABEL_c6a448;
            if (*(int *)index)
            {
                if (*(int *)index == 1)
                {
                    v31 = *(long long *)*(long long *)(index + 8);
                    v32 = *(long long *)(*(long long *)(index + 8) + 8);
                    goto LABEL_c6a318;
                }
                goto LABEL_c6a448;
            }
            v31 = *(long long *)(index + 8);
            v32 = v31;
LABEL_c6a318:
            if (!(sub_ae3bc0(v29) >> 31 & 1) || 0 < (int)sub_9c0ffc(v29, v30) || 0 < (int)sub_9c0ffc(v31, v32))
                goto LABEL_c6a448;
            if (!v25 && !(v25 = sub_9e4958(), v25))
            {
LABEL_c6a3ac:
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_asid.c", 301, "ASIdentifierChoice_is_canonical");
                v35 = 524291;
                goto LABEL_c6a440;
            }
            if (!sub_9c1c08(v30, v25) || !sub_9eb9e0(v25, 1))
                goto LABEL_c6a3ac;
            v33 = sub_9c1acc(v25, v26);
            if (v33)
            {
                v26 = v33;
                v24 = (unsigned int)v24 + 1;
                if (!(sub_ae3bc0() >> 31 & 1))
                {
                    v34 = 0;
                    break;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_asid.c", 307, "ASIdentifierChoice_is_canonical");
                v35 = 524301;
LABEL_c6a440:
                sub_a36abc(0x22, v35, 0);
LABEL_c6a448:
                v34 = 0;
                break;
            }
        }
        else
        {
            v36 = sub_ad69e4(*a0);
            v37 = sub_ad69f8(*a0, v36 - 1);
            if (!v37 || *(int *)v37 != 1 || 0 >= (int)sub_9c0ffc(*(long long *)*(long long *)(v37 + 8), *(long long *)(*(long long *)(v37 + 8) + 8)))
            {
                v34 = 1;
                break;
            }
            goto LABEL_c6a448;
        }
    }
    *(unsigned int *)a1 = v34;
    sub_9cf124(v26);
}
