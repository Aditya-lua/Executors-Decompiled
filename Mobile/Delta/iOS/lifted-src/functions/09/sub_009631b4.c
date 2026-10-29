/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9631b4..0x9633a4 (496 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9631b4_0 {
    unsigned int field_0;
    char padding_4[2612];
    unsigned short field_a38;
    char padding_a3a[318];
    struct st_9631b4_0 *field_b78;
} st_9631b4_0;


st_9631b4_0 * sub_9631b4(st_9631b4_0 *a0)
{
    unsigned long v3;  // x8
    unsigned long long v4;  // x24
    unsigned long long v13;  // x0
    long long v5;  // x19
    unsigned long long v6;  // x0
    unsigned long long v7;  // x19
    unsigned long long v8;  // x20
    unsigned long long v9;  // x21
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    long long v12;  // x19
    unsigned long long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0)
        return a0;
    v3 = a0->field_0;
    if (!(unsigned int)v3)
    {
LABEL_9631ec:
        if (a0[1].field_0)
            return a0->field_b78;
        v4 = a0;
        if (*(long long *)&a0->padding_4[2604])
        {
            v0 = *(long long *)&a0->padding_4[2604];
            v5 = sub_9f6bdc(0, &v0, a0->field_a38);
            v6 = sub_9640a8(v4 + 2936, v5, 1);
            sub_9f7788(v5);
            a0 = v4;
            if (!(v6 >> 31 & 1))
                goto LABEL_96323c;
        }
        else
        {
LABEL_96323c:
            if (*(long long *)&a0->padding_a3a[22] && *(long long *)&a0->padding_a3a[30])
            {
                v0 = *(long long *)&a0->padding_a3a[22];
                v7 = sub_a9b284(0, &v0, (int)*(long long *)&a0->padding_a3a[30]);
                if (v7)
                {
                    v8 = sub_a9b32c(v7);
                    if (!v8 || (int)sub_a9b3d0(v8) < 1)
                        goto LABEL_963310;
                    v9 = 0;
                    v10 = 0;
                    v11 = 0;
                    do
                    {
                        if (!sub_a9b3e4(v8, v9))
                            continue;
                        v10 = sub_a9b424();
                        v11 = sub_9640a8(v4 + 2936, v10, 3);
                        if (v11 >> 31 & 1)
                            break;
                    } while ((v9 = (unsigned int)v9 + 1, (int)sub_a9b3d0(v8) > (int)v9));
                    sub_9f7788(v10);
                    sub_a9b308(v8);
                    sub_a9b290(v7);
                    if (!(v11 >> 31 & 1))
                        goto LABEL_963328;
                }
                else
                {
                    v8 = 0;
LABEL_963310:
                    sub_9f7788(0);
                    sub_a9b308(v8);
                    sub_a9b290(v7);
LABEL_963328:
                    if (!*(long long *)(v4 + 0x900))
                    {
                        *(unsigned int *)(v4 + 2944) = 1;
                        return *(long long *)(v4 + 2936);
                    }
                    if (*(long long *)(*(long long *)(v4 + 0x900) + 704))
                    {
                        v12 = sub_af2750(*(long long *)(*(long long *)(v4 + 0x900) + 704), 951, 0, 0);
                        v13 = sub_9640a8(v4 + 2936, v12, 2);
                        sub_9f7788(v12);
                        if (!(v13 >> 31 & 1))
                        {
                            *(unsigned int *)(v4 + 2944) = 1;
                            return *(long long *)(v4 + 2936);
                        }
                    }
                    else
                    {
                        *(unsigned int *)(v4 + 2944) = 1;
                        return *(long long *)(v4 + 2936);
                    }
                }
            }
            else
            {
                v8 = 0;
                v7 = 0;
                goto LABEL_963310;
            }
        }
    }
    else if (v3 >> 7 & 1)
    {
        a0 = sub_980dc8();
        if (!a0)
            return a0;
        goto LABEL_9631ec;
    }
    return 0;
}
