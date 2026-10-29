/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ddb90..0x9ddd38 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_9ddb90(char *a0, char *a1)
{
    char *v2;  // x20
    char *v3;  // x23
    char *v12;  // x22
    char *v13;  // w26
    unsigned int v14;  // w8
    char *v15;  // w8
    unsigned long v4;  // cc_dep1
    char *v5;  // x25
    unsigned long long v6;  // 4106
    unsigned long long v7;  // 4106
    char *v8;  // x24
    unsigned int v9;  // w22
    char *v10;  // x20
    char *v11;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return 0;
    v2 = *a1;
    if (!(unsigned int)v2)
        return v2;
    v3 = 0;
    v4 = v2 & 0xff;
    if ((unsigned int)v2 != 45)
    {
        v5 = a1;
        v6 = arm64g_calculate_condition(19, v4, 45, 0);
        if (!(v6 & 1))
            goto LABEL_9ddbce;
LABEL_9ddbcd:
        v8 = 0;
    }
    else
    {
        v5 = a1 + 1;
        v7 = arm64g_calculate_condition(19, v4, 45, 0);
        if (v7 & 1)
            goto LABEL_9ddbcd;
LABEL_9ddbce:
        v8 = 1;
    }
    v9 = 63;
    do
    {
        if (!sub_a69974(*(char *)(v5 + v3)) && v3)
        {
            v10 = v8 + v3;
            if (!a0)
                return v10;
            v11 = *(long long *)a0;
            if (v11)
            {
                sub_9e5b4c(v11);
            }
            else
            {
                v11 = sub_9e4958();
                if (!v11)
                    return 0;
            }
            if (0x1ffffff0 >= v3 && ((int)(v9 >> 6) <= *(int *)&v11[12] || sub_9e49b8(v11)))
            {
                v12 = 0;
                v13 = (char *)((unsigned int)v3 + 1);
                v14 = 19 * (unsigned int)(v3 / 19);
                if (v14 == (unsigned int)v3)
                    v15 = (char *)0;
                else
                    v15 = (char *)((unsigned int)(v14 - v3) + 19);
                while (1)
                {
                    v12 = *v5 + 10 * v12 - 48;
                    v15 += 1;
                    if (v15 == 19)
                    {
                        if (!sub_9ebbfc(v11, -8446744073709551616) || !sub_9eb9e0(v11, v12))
                            break;
                        v12 = 0;
                        v15 = (char *)0;
                    }
                    v13 -= 1;
                    v5 += 1;
                    if (v13 <= 1)
                    {
                        sub_9e5708(v11);
                        *(char **)a0 = v11;
                        if (*(int *)&v11[8])
                        {
                            *(unsigned int *)&v11[16] = (unsigned int)v8;
                            return v10;
                        }
                        return v10;
                    }
                }
            }
            goto LABEL_9ddc1c;
        }
    } while ((v3 += 1, v9 += 4, v3 != 0x20000000));
    v11 = 0;
LABEL_9ddc1c:
    if (!*(long long *)a0)
        sub_9e48d4(v11);
    return 0;
}
