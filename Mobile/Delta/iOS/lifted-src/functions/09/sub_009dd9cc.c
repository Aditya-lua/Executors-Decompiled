/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dd9cc..0x9ddb90 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_9dd9cc(char *a0, char *iter)
{
    char *v3;  // x19
    char *v4;  // x24
    char *v13;  // x26
    char *i;  // x24
    char *v15;  // x27
    char *v16;  // x8
    char *j;  // x28
    char *v18;  // x21
    unsigned int v20;  // w0
    char *v21;  // x8
    unsigned long v5;  // cc_dep1
    char *v6;  // x21
    unsigned long long v7;  // 4106
    unsigned long long v8;  // 4106
    unsigned int v9;  // w25
    char *v10;  // x19
    char *v11;  // x20
    char *v12;  // x24
    char *v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!iter)
        return 0;
    v3 = *iter;
    if (!(unsigned int)v3)
        return v3;
    v4 = 0;
    v5 = v3 & 0xff;
    if ((unsigned int)v3 != 45)
    {
        v6 = 0;
        v7 = arm64g_calculate_condition(19, v5, 45, 0);
        if (!(v7 & 1))
            goto LABEL_9dda0e;
LABEL_9dda0d:
    }
    else
    {
        v6 = 1;
        v8 = arm64g_calculate_condition(19, v5, 45, 0);
        if (v8 & 1)
            goto LABEL_9dda0d;
LABEL_9dda0e:
        iter += 1;
    }
    v9 = 63;
    while (sub_a6994c(*iter, 16))
    {
        iter += 1;
        v9 += 4;
        if (v4 == 0xffffffffe0000001)
            return 0;
    }
    if (v4)
    {
        v10 = v6 - v4;
        if (!a0)
            return v10;
        v11 = *(long long *)a0;
        if (!v11)
        {
            v11 = sub_9e4958();
            if (!v11)
                return 0;
            goto LABEL_9ddab0;
        }
        else if (sub_9e48c8(v11, 2))
        {
            sub_a368c8();
            sub_a369bc("crypto/bn/bn_conv.c", 151, "BN_hex2bn");
            sub_a36abc(3, 0x80106, 0);
        }
        else
        {
            sub_9e5b4c(v11);
LABEL_9ddab0:
            v12 = -v4;
            if (v12 <= 0x1ffffff0 && ((int)(v9 >> 6) <= *(int *)&v11[12] || sub_9e49b8(v11)))
            {
                v0 = v6;
                v13 = 0;
                do
                {
                    i = v12;
                    v15 = 0;
                    if (i < 16)
                        v16 = i;
                    else
                        v16 = 16;
                    j = v16 + 1;
                    v18 = iter - v16;
                    do
                    {
                        v20 = sub_a6dd0c(*v18);
                        v15 = v20 & ~((int)(v20) >> 31) | v15 * 16;
                        j -= 1;
                        v18 += 1;
                    } while (1 < j);
                    v21 = v13 + 1;
                    *(char **)(*(long long *)v11 + v13 * 8) = v15;
                    iter -= 16;
                    v12 = i - 16;
                    v13 = v21;
                } while (16 < i);
                *(unsigned int *)&v11[8] = (unsigned int)v21;
                sub_9e5708(v11);
                *(char **)a0 = v11;
                if (*(int *)&v11[8])
                {
                    *(unsigned int *)&v11[16] = (unsigned int)v0;
                    return v10;
                }
                return v10;
            }
            if (!*(long long *)a0)
                sub_9e48d4(v11);
        }
    }
    return 0;
}
