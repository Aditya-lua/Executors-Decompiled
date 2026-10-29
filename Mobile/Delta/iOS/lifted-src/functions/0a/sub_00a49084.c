/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa49084..0xa49134 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a49084(long long a0, long long a1, unsigned long a2, unsigned int a3)
{
    char v0;  // [bp-0x108]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a3 && sub_a4fdf4(sub_a2d030()) != 4 && sub_a4fdf4(sub_a2d030(a0)) != 3)
    {
        sub_a66288(a1, &v0);
        sub_a663dc(&v0, sub_9ffdd8(a0));
        sub_a66ec0(&v0, 216);
        return 1;
    }
    sub_a66288(a1, sub_9ffdd8());
    return 1;
}
