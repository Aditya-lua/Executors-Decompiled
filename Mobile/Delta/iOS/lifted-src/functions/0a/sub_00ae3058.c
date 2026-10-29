/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae3058..0xae33ec (916 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae3058_0 {
    char padding_0[8];
    long long field_8;
} st_ae3058_0;

extern long long g_eb5788;

unsigned long long sub_ae3058(st_ae3058_0 *a0)
{
    unsigned long long v14;  // x28
    unsigned long long v15;  // x27
    unsigned long long v24;  // x30
    unsigned long long v25;  // x28
    unsigned long long v26;  // x20
    unsigned long long v27;  // x22
    unsigned long long iter;  // x27
    unsigned long v29;  // x25
    unsigned long long v30;  // x0
    unsigned long long index;  // x26
    unsigned long v32;  // x19
    unsigned long v33;  // x28
    unsigned long long v16;  // x26
    unsigned long v34;  // x24
    unsigned long v35;  // x23
    unsigned long long v36;  // x0
    unsigned long long v37;  // x0
    unsigned long long v38;  // x8
    long long v39;  // x1
    unsigned long long v40;  // x19
    unsigned int v41;  // w0
    unsigned long long v42;  // x0
    unsigned long long v17;  // x25
    unsigned long long v18;  // x24
    unsigned long long v19;  // x23
    unsigned long long v20;  // x22
    unsigned long long v21;  // x21
    unsigned long long v22;  // x20
    unsigned long long v23;  // x19
    unsigned long long v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x60]
    unsigned long long v2;  // [bp-0x58]
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    if (!a0)
        return 1;
    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = &v13;
    v12 = v24;
    if (!*(int *)&a0->padding_0[0])
        return 1;
    if (*(int *)&a0->padding_0[0] == 1 && sub_ad69e4(a0->field_8))
    {
        sub_ad6ae4(a0->field_8);
        if ((int)sub_ad69e4(a0->field_8) >= 2)
        {
            v25 = 0;
            v26 = 0;
            v27 = 0;
            do
            {
                iter = sub_ad69f8(a0->field_8, v27);
                v29 = (unsigned int)v27 + 1;
                v30 = sub_ad69f8(a0->field_8, v29);
                if (!iter)
                {
                    sub_9cf124(v25);
                    sub_9e48d4(v26);
                    return 0;
                }
                index = v30;
                v0 = v25;
                if (*(int *)iter == 1)
                {
                    v32 = *(long long *)*(long long *)(iter + 8);
                    v33 = *(long long *)(*(long long *)(iter + 8) + 8);
                }
                else if (!*(int *)iter)
                {
                    v32 = *(long long *)(iter + 8);
                    v33 = v32;
                }
                else
                {
                    sub_9cf124(v25);
                    sub_9e48d4(v26);
                    return 0;
                }
                if (!index)
                {
                    sub_9cf124(v0);
                    sub_9e48d4(v26);
                    return 0;
                }
                if (*(int *)index == 1)
                {
                    v34 = *(long long *)*(long long *)(index + 8);
                    v35 = *(long long *)(*(long long *)(index + 8) + 8);
                }
                else if (!*(int *)index)
                {
                    v34 = *(long long *)(index + 8);
                    v35 = v34;
                }
                else
                {
                    sub_9cf124(v0);
                    sub_9e48d4(v26);
                    return 0;
                }
                if (0 < (int)sub_9c0ffc(v32, v34))
                {
                    sub_9cf124(v0);
                    sub_9e48d4(v26);
                    return 0;
                }
                if (0 < (int)sub_9c0ffc(v32, v33))
                {
                    sub_9cf124(v0);
                    sub_9e48d4(v26);
                    return 0;
                }
                if (0 < (int)sub_9c0ffc(v34, v35))
                {
                    sub_9cf124(v0);
                    sub_9e48d4(v26);
                    return 0;
                }
                if (!(sub_9c0ffc(v33, v34) >> 31 & 1))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_asid.c", 406, "ASIdentifierChoice_canonize");
                    sub_a36abc(0x22, 116, 0);
                    sub_9cf124(v0);
                    sub_9e48d4(v26);
                    return 0;
                }
                if (!v26 && !(v26 = sub_9e4958(), v26))
                {
LABEL_ae3318:
                    v25 = v0;
LABEL_ae331c:
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_asid.c", 414, "ASIdentifierChoice_canonize");
                    v39 = 524291;
                    goto LABEL_ae33ac;
                }
                if (!sub_9c1c08(v33, v26))
                    goto LABEL_ae3318;
                v25 = v0;
                if (!sub_9eb9e0(v26, 1))
                    goto LABEL_ae331c;
                v36 = sub_9c1acc(v26, v25);
                if (!v36)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_asid.c", 420, "ASIdentifierChoice_canonize");
                    v39 = 524301;
LABEL_ae33ac:
                    sub_a36abc(0x22, v39, 0);
                    sub_9cf124(v25);
                    sub_9e48d4(v26);
                    return 0;
                }
                v25 = v36;
                if (sub_9c0ffc())
                {
                    v27 = v29;
                    continue;
                }
                if (*(int *)iter != 1)
                {
                    if (*(int *)iter)
                        goto LABEL_ae3288;
                    v37 = sub_a6bf4c(16, "crypto/x509/v3_asid.c", 431);
                    if (!v37)
                    {
                        sub_9cf124(v25);
                        sub_9e48d4(v26);
                        return 0;
                    }
                    *(unsigned long *)v37 = v32;
                    *(unsigned long *)(v37 + 8) = v35;
                    v35 = v37;
                    *(unsigned int *)iter = 1;
                }
                else
                {
                    sub_9cf124(*(long long *)(*(long long *)(iter + 8) + 8));
                    iter = *(long long *)(iter + 8);
                }
                *(unsigned long *)(iter + 8) = v35;
LABEL_ae3288:
                v38 = index;
                if (*(int *)v38)
                {
                    if (*(int *)index != 1)
                        goto LABEL_ae32a4;
                    v38 = *(long long *)(index + 8);
                }
                *(unsigned long long *)(v38 + 8) = 0;
LABEL_ae32a4:
                sub_9cd960(index, &g_eb5788);
                sub_ad664c(a0->field_8, v29);
            } while ((int)(sub_ad69e4(a0->field_8) - 1) > (int)v27);
        }
        else
        {
            v26 = 0;
            v25 = 0;
        }
        v41 = sub_ad69e4(a0->field_8);
        v42 = sub_ad69f8(a0->field_8, v41 - 1);
        if (v42 && *(int *)v42 == 1 && 0 < (int)sub_9c0ffc(*(long long *)*(long long *)(v42 + 8), *(long long *)(*(long long *)(v42 + 8) + 8)))
        {
            sub_9cf124(v25);
            sub_9e48d4(v26);
            return 0;
        }
        v40 = sub_ae2ff0(a0) != 0;
        sub_9cf124(v25);
        sub_9e48d4(v26);
        return v40;
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/v3_asid.c", 368, "ASIdentifierChoice_canonize");
    sub_a36abc(0x22, 116, 0);
    return 0;
}
