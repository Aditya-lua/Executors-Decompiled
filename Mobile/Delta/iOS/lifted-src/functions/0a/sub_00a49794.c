/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa49794..0xa49818 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a49794(long long a0, int a1, int a2)
{
    unsigned int v2;  // w0
    unsigned int *v3;  // x3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    switch (a1)
    {
    case 3:
        if (a2 >= 1)
        {
            *(int *)sub_9ffdd8() = a2;
            break;
        }
        else
        {
            return 0;
        }
    case 2:
        *v3 = *(int *)sub_9ffdd8();
        break;
    case 0:
        v2 = sub_a50904();
        *(unsigned int *)sub_9ffdd8(a0) = v2 * 8;
        break;
    default:
        return -0x1;
    }
    return 1;
}
